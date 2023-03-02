package exercise.zhizunNote;

public class text4 {
    void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println();
    }

    void dianDao(int[] a){
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }


    public static void main(String[] args) {
        int[] c = {5,8,2,18,33,6};
        text4 soft = new text4();
        soft.printArray(c);
        soft.dianDao(c);
        soft.printArray(c);

        int min = c[0];
        for (int i = 1; i < c.length; i++) {
            if(min>c[i]) {
                min = c[i];
            }
        }
        int minIndex = 0;
        for (int i = 1; i < c.length; i++) {
            if(c[minIndex]>c[i]){
                minIndex = i;
            }
        }
        int t = c[0];
        c[0] = c[minIndex];
        c[minIndex] = t;
        soft.printArray(c);

        int a = 66,b=77;
        System.out.println(a+","+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+","+b);


    }
}
