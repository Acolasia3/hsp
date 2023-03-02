package medium.ioStream.homework;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class demo {
    @Test
    public void create() {
        String src = "e:\\demo.txt";
        File file = new File(src);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //单个字节显示到后台
    @Test
    public void show2() {
        String file = "e:\\a.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(file);
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //作业1
    @Test
    public void create2() throws IOException {
//        String path = "e:\\";
        String src = "e:\\demo";
        File file1 = new File(src);
        if (file1.exists()) {
            System.out.println(src + "文件已存在");
        } else {
            if (file1.mkdirs()) {
                System.out.println(src + "创建成功");
            } else {
                System.out.println(src + "创建失败");
            }
        }

        String src2 = src + "\\hello.txt";
        File file2 = new File(src2);
        FileOutputStream fileOutputStream = null;
        if (file2.exists()) {
            System.out.println(src2 + "文件已存在");
        } else {
            try {
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(src2);
                fileOutputStream.write("hello".getBytes());
                fileOutputStream.close();
                System.out.println(src2 + "创建成功");
            } catch (IOException e) {
                System.out.println(src2 + "创建失败");
            }
        }
    }

    //作业2
    @Test
    public void show() throws IOException {
        String file = "e:\\ok.txt";
//        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        int lineNum = 0;
        //转成gbk编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "gbk");
        BufferedReader br = new BufferedReader(isr);
        while ((line = br.readLine()) != null) {
            System.out.println("第" + ++lineNum + "行 " + line);
        }
        if (br != null) {
            br.close();
        }
    }

    //作业3
    @Test
    public void properties() throws IOException {
//        Dog dog = new Dog();
        BufferedReader br = new BufferedReader(new FileReader("src\\dog.properties"));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}

class Cat {
    String name;
    int age;
    String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}


