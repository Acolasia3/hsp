package primary.object.interface_.demo;

public class Interface {
    public static void main(String[] args) {
        //phone 实现了 UsbInterface
        Phone phone = new Phone();
        //camera 实现了 UsbInterface
        Camera camera = new Camera();
        Computer computer = new Computer();
        computer.work(phone);//UsbInterface phone = new Phone();
        System.out.println("=============");
        computer.work(camera);//UsbInterface camera = new Camera();
    }
}
