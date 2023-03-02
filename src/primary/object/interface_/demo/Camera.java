package primary.object.interface_.demo;

public class Camera implements UseInterface {//实现接口，把接口的方法实现
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机结束工作");
    }
}
