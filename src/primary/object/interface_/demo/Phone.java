package primary.object.interface_.demo;

//Phone类实现UsbInterface
//1.Phone类需要实现UsbInterface接口 规定/声明的方法
public class Phone implements UseInterface {
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机结束工作");
    }
}
