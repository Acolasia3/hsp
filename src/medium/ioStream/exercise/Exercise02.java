package medium.ioStream.exercise;

import java.io.*;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise02 {
    public static void main(String[] args) throws IOException {
        String path = "e:\\hello.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path),"utf-8");
        BufferedReader bufferedReader = new BufferedReader(isr);

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String readLen;
        int i = 1;
        while ((readLen = bufferedReader.readLine()) != null) {
            System.out.println(i++ + ":" + readLen);
        }
        bufferedReader.close();
    }
}
