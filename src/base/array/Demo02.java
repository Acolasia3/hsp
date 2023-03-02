package base.array;

public class Demo02 {
     public static void main(String[] args) {
         //打印26个字母
         char[] chars = new char[26];
         for (int i = 0; i < chars.length; i++) {
             chars[i] = (char) ('A' + i);
         }

         //遍历数组
         for (int i = 0; i < chars.length; i++) {
             System.out.print(chars[i] + " ");
         }
         System.out.println();

         for (char i = 'A'; i <= 'Z'; i++) {
             System.out.print(i + " ");
         }
         System.out.println();
     }

   /* public static void main(String[] args) {
        //打印数组的最大值和对应的下标
        int[] num = {1, 3, 5};
        int max = num[0];
        int maxIndex = 0;
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
*/
}

