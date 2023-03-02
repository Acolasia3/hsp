package exercise.zhizunNote;

import java.util.Arrays;

public class text5 {
    static void printArray(int[] a){
        for(int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static int[] copyArray(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {5,8,2,7,9};
        int[] b = a;
        b[0] = 50;
        System.out.println(a[0]);
        //值传递
        int aa = 5;
        int bb = aa;
        System.out.println(aa);

        int[] c = Arrays.copyOf(a,a.length);
        text5.printArray(c);

        Arrays.sort(a);
        text5.printArray(a);

        int ret = Arrays.binarySearch(a,55);
        System.out.println(ret);//-6

        String e ="abcd";
        System.out.println(e.charAt(0));
        System.out.println(e.charAt(3));
        System.out.println(e.length());

        for (int i = 0; i < e.length(); i++) {
            System.out.print(e.charAt(i)+" ");
        }
        System.out.println();

        String h = "dddd";
        String k = "dddd";
        System.out.println(h==k);
        System.out.println(h.equals(k));

        String hh = new String("dddd");
        String kk = new String("dddd");
        System.out.println(hh==kk);
        System.out.println(hh.equals(kk));

        char[] m = {'示','范','院','校','验','收'};
        String m1 = new String(m);
        System.out.println(m1);

        char[] m2 = m1.toCharArray();

    }
}
