package base.oop;

public class Constructor {
    //����������ɶ���ĳ�ʼ��
    //javapָ����Է�����
    //�����幹������Ĭ��һ��������
    public static void main(String[] args) {
        L l = new L("hsp",80);
        L l1 = new L("tom");
        System.out.println("l����Ϣ����");
        System.out.println(l.name);
        System.out.println(l.age);
        System.out.println(l1.name);
    }
}
class L{
    String name;
    int age;

    public L(String pName,int pAge){
        System.out.println("l������������");
        name = pName;
        age = pAge;
    }

    //����������
    public L(String pName){
        System.out.println("l1������������");
        name = pName;
    }
}
class Dog{

}
