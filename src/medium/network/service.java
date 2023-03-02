package medium.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class service {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端口9999等待监听");

        Socket socket = serverSocket.accept();

        System.out.println("medium.socket="+socket.getClass());

        InputStream inputStream = socket.getInputStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        inputStream.close();
        socket.close();
        serverSocket.close();


    }
}
