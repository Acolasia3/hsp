package base.hashCode;

public class HashCode {
    //HashCode方法
    //1.提高具有哈希结构的容器的效率
    //2.两个引用，如果指向的是同一个对象，则哈希值肯定是一样的
    //3.两个引用，如果指向的是不同对象，则哈希值是不一样的
    //4.哈希值主要根据地址号（十六进制）来的，不能完全将哈希值等价于地址
    //5.后面在集合中HashCode如果需要的话，也会重写
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        A a3 = a;
        System.out.println(a.hashCode());//哈希值十进制（地址号）
        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);
    }
}

class A{}

