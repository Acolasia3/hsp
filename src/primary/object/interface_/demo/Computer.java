package primary.object.interface_.demo;

public class Computer {
    //编写一个方法
    //1.UseInterface useInterface 形参是接口类型 UsbInterface
    //2.看到接收 实现了UsbInterface接口类的对象实例
    public void work(UseInterface useInterface){
        //通过接口来调用方法
        useInterface.start();
        useInterface.stop();
    }
}
