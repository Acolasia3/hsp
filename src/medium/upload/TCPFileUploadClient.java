package medium.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


/**
 * @author 韩顺平
 * @version 1.0
 * 文件上传的客户端
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //1.客户端连接服务端 8888，得到Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //2.创建读取磁盘文件的输入流
//        String filePath = "d:\\sky.jpg";
        String filePath = "d:\\无名.mp3";
        BufferedInputStream bis  = new BufferedInputStream(new FileInputStream(filePath));

        //3.bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //4.通过socket获取到输出流, 将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);//将文件对应的字节数组的内容，写入到数据通道
        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标记

        //=====接收从服务端回复的消息=====
        InputStream inputStream = socket.getInputStream();
        //5.使用StreamUtils 的方法，直接将 inputStream 读取到的内容 转成字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);


        //关闭相关的流
        inputStream.close();
        bos.close();
        socket.close();

    }
}
