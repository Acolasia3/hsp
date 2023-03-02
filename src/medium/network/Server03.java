package medium.network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Server03 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        System.out.println("服务端端口9999等待连接");

        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen;
        while((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }

        String destPath = "src\\tk.jpg";
        OutputStream outputStream = new FileOutputStream(destPath);
        outputStream.write(buf);

    }
}
