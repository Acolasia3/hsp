package medium.network;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Client03 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        String filePath = "src\\sky.jpg";
//        FileInputStream fs = new FileInputStream(filePath);
        InputStream inputStream = new FileInputStream(filePath);
        byte[] buf = new byte[1024];
        int readLen;
        while((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(buf);


    }
}
