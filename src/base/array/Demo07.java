package base.array;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        //查找
        String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼福王"};
        System.out.println("请输入元素");
        Scanner scanner = new Scanner(System.in);
        String findName = scanner.next();

        int index = -1;//妙点
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(findName)) {
                System.out.println("恭喜你找到" + findName);
                System.out.println("下标为=" + i);
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("没有找到~");
        }
    }
}
