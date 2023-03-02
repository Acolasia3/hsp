package exercise.zhizunNote;

public class text6 {
    void printString(String a) {
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("参数个数" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("参数" + i + ":" + args[i]);
        }

        String s = "abcde";
        char[] a = s.toCharArray();

        String b = new String(a);
        System.out.println(b);

        s = s.toUpperCase();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    counter++;
                    break;
            }
        }
        System.out.println("元音字母的个数" + counter);

        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        System.out.println(str);

        StringBuffer stringBuffer = new StringBuffer(str);

        StringBuffer stringBuffer1 = stringBuffer.reverse();
        System.out.println(stringBuffer1);

        String ss = "1234567";
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < ss.length(); i++) {
            sb.insert(0, ss.charAt(i));
        }
        System.out.println(sb);

        String h = String.valueOf(true);
        h = String.valueOf(100);
        h = String.valueOf(123.4567);

        h = "" + 3.14;


        //基本数据包装
        int intA = Integer.parseInt("123");

        float floatH = Float.parseFloat(h);

        boolean boolH = Boolean.parseBoolean("false");
        boolH = Boolean.getBoolean("true");
    }
}
