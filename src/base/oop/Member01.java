package base.oop;

public class Member01 {
    public static void main(String[] args) {
        //1.判断是不是奇数
        AA aa = new AA();
//        boolean num1 = aa.isOdd(1);
//        System.out.println(num1);
        if (aa.isOdd(1)) {
            System.out.println("是奇数");
        } else {
            System.out.println("是偶数");
        }


        //2.打印4行,4列 字符#
        aa.print(4, 4, '#');
    }
}

class AA {
    public boolean isOdd(int num) {
//        if(num%2!=0){
//            return true;
//        }else{
//            return false;
//        }

        return num % 2 != 0;//num%2!=0 ? true : false
    }

    public void print(int row, int col, char c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
