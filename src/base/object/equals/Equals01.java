package base.object.equals;

public class Equals01 {
    public static void main(String[] args) {
        //     ==运算符
        //1.== 既可以判断基本类型，又可以判断引用类型
        //2.== 如果判断基本类型，判断的是值是否相等
        //3.== 如果判断引用类型，判断的是地址是否相等，即判断是不是同一个对象



        //     equals方法
        //equals:是Object类的方法，只能判断引用类型
        //默认判断的是地址是否相等，子类往往重写该方法，用于判断内容是否相等，比如Integer，String



        //Object的equals方法，默认就是比较对象地址是否相同
      /*
        public boolean equals(Object obj) {  //Object 是传进来的对象
            return (this == obj);
        }
         */



        //String的equals方法，把String的equals方法重写了，变成了（比较字符串的值）是否相同
        /*
          public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i]){
                      return false;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }
         */



        //Integer的equals方法，Integer是基本数据类型
        //变成了判断（两个值）是否相同
        /*
        public boolean equals(Object obj) {
            if (obj instanceof Integer) {
                return value == ((Integer)obj).intValue();
            }
            return false;
        }
         */


        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);//false,开辟了两个空间
        System.out.println(integer1.equals(integer2));//true,对象值相同

        String string1 = new String("hsp");
        String string2 = new String("hsp");
        System.out.println(string1 == string2);//false，不是同一个地址
        System.out.println(string1.equals(string2));//true,字符串值相同


    }
}
