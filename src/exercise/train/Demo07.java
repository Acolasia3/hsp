package exercise.train;


import java.util.Scanner;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组");
        String str = scanner.next();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        String num = " ";
        String z = " ";
        String Z = " ";
        String m = " ";
        /*char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char value = arr[i];

            if (value > 'A' && value < 'Z') {
                a++;
                z += value;
            } else if (value > 'a' && value < 'z') {
                b++;
                Z += value;
            } else if (value >= '0' && value <= '9') {
                c++;
                num += value;
            } else {
                d++;
                m += value;
            }
        }
        System.out.println(a + " " + Z);
        System.out.println(b + " " + z);
        System.out.println(c + " " + num);
        System.out.println(d + " " + m);*/
        for (int i = 0; i < str.length(); i++) {
            char v = str.charAt(i);
            if(v>'A'&&v<'Z'){
                a++;
                Z+=v;
            }else if(v>'a'&&v<'z'){
                b++;
                z+=v;
            }else if(v>='0'&&v<='9'){
                c++;
                num+=v;
            }else{
                d++;
                m+=v;
            }
        }
        System.out.println(a + " " + Z);
        System.out.println(b + " " + z);
        System.out.println(c + " " + num);
        System.out.println(d + " " + m);
    }
}
