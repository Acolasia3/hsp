package base.object.extend.modifier;

public class Sub extends Base {
    public Sub() {
        System.out.println("Sub().....");
    }

    public void sayOk() {
        //非私有的属性和方法可以直接访问
        System.out.println(n1 + " " + n2 + " " + n3 + " ");
        System.out.println("n4=" + getN4());
        test100();
        test200();
        test300();
        callTest400();
    }
}
