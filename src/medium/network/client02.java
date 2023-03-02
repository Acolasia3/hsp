package medium.network;

import medium.upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class client02 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端连接");

        String filePath = "d:\\sky.jpg";

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        byte[] bytes = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        socket.close();
        bos.close();
        inputStream.close();
    }
}
