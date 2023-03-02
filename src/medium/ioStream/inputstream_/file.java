package medium.ioStream.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class file {
    @Test
    public void read01() {
        String filePath = "e:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);

            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void file02() {
        String filePath = "e:\\hello.txt";
        byte[] bytes = new byte[1];
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, readData));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void file03() throws IOException {
        String filePath = "e:\\hello.txt";
        byte[] bytes = new byte[3];
        int read = 0;
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(filePath);
        while ((read = fileInputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0, read));
        }
        fileInputStream.close();
    }
}
