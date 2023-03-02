package medium.ioStream.writer_;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class copy {
    public static void main(String[] args) {
//        String srcFilePath = "e:\\a.txt";
//        String destFilePath = "e:\\a2.java";
//        int line;
//        FileReader fileReader = null;
//        FileWriter fileWriter = null;
//        try {
//            fileReader = new FileReader(srcFilePath);
//            fileWriter = new FileWriter(destFilePath);
//            while ((line = fileReader.read()) != 0) {
//                fileWriter.write(line);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fileReader != null){
//                    fileReader.close();
//                }
//                if(fileWriter != null){
//                    fileWriter.close();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }


        String file = "e:\\a.txt";
        String file2 = "e:\\a.java";
        int len = 0;
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file2);
            while ((len = fileReader.read()) != -1) {
                fileWriter.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String file = "e:\\a.txt";
//        String file2 = "e:\\a.java";
//        String len = null;
//        BufferedReader bufferedReader = null;
//        BufferedWriter bufferedWriter = null;
//
//        try {
//            bufferedReader = new BufferedReader(new FileReader(file));
//            bufferedWriter = new BufferedWriter(new FileWriter(file2));
//            while((len = bufferedReader.readLine()) != null){
//                bufferedWriter.write(len);
//                bufferedWriter.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//
//            try {
//                if(bufferedWriter!=null) {
//                    bufferedWriter.close();
//                }else if(bufferedReader !=null){
//                    bufferedReader.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        try {
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
