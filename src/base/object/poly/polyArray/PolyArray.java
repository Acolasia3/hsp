package base.object.poly.polyArray;

public class PolyArray {
    public static void main(String[] args) {
        //*多态数组*
        //应用实例:现有一个继承结构如下:要求创建1个Person对象、
        //2个Student对象和2个Teacher对象,统一放在数组中,并调每个对象say方法
        Person[] persons = new Person[5];
        persons[0] = new Person("人类", 100);
        persons[1] = new Student("小明", 10, 100.0);
        persons[2] = new Student("小红", 15, 60.0);
        persons[3] = new Teacher("大明", 30, 20000);
        persons[4] = new Teacher("大红", 40, 30000);
        System.out.println(persons[0].say());

        System.out.println("=======使用多态数组========");
        //循环遍历多态数组,调用say
        for (int i = 0; i < persons.length; i++) {
            //person[i]编译类型是Person,运行类型是根据实际情况由JVM来判断
            System.out.println(persons[i].say());//动态绑定机制

            //把编译类型转成Student或Teacher
            if (persons[i] instanceof Student) {
                Student student = (Student) persons[i];
                student.study();  //调用子类特有的方法
                //匿名对象 ((Student)person[i]).study();  向下转型
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();//匿名对象
            } else {
                System.out.println("对象有误");
            }
        }
    }
}