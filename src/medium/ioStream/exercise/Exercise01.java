package medium.ioStream.exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise01 {
    public static void main(String[] args) throws IOException {
//        String path = "e:\\mytemp3";
//        File file = new File(path);
//        if (!file.exists()) {
//            if (file.mkdirs()) {
//                System.out.println(path + "创建");
//            } else {
//                System.out.println(path + "已存在");
//            }
//        }
//
//        String path2 = path + "\\hello.txt";
//        file = new File(path2);
//        if (!file.exists()) {
//            if (file.createNewFile()) {
//                System.out.println("hello.txt创建成功");
//
//                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
//                bufferedWriter.write("helloworld,tao");
//                bufferedWriter.close();
//
//            } else {
//                System.out.println("hello创建失败");
//            }
//        }else{
//            System.out.println(path2+"已存在");
//        }

        /*String path = "e:\\mysql";
        File file = new File(path);
        if(!file.exists()){
            if(file.mkdirs()){
                System.out.println(path+"创建成功");
            }else{
                System.out.println(path+"创建失败");
            }
        }

        String path2 = path + "\\hello.txt";
        file = new File(path2);
        if(!file.exists()) {
            if (file.createNewFile()) {
                System.out.println(path2 + "创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello");
                bufferedWriter.close();
            } else {
                System.out.println(path2 + "创建失败");
            }
        }else{
            System.out.println(file+"已存在");
        }

         */

        String path = "e:\\mytao";
        File file = new File(path);
        if(!file.exists()){
            if(file.mkdirs()){
                System.out.println("创建成功"+file);
            }else{
                System.out.println("创建失败"+file);
            }
        }

        String path2 = path+"\\hello";
        file = new File(path2);
        if(!file.exists()){
            if(file.createNewFile()){
                System.out.println("创建"+file);
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write("hello");
                bw.close();
            }else{
                System.out.println("创建失败"+file);
            }
        }else{
            System.out.println(file+"已存在");
        }
    }

}
