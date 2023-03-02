package primary.object.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        //2.多态数组 -> 接口类数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        /*
        给Usb数组中，存放Phone 和 camera对象，Phone类还有一个特有的方法call(),
        请遍历Usb数组，如果是Phone对象，除了调用Usb接口定义的方法外，
        还需要调用Phone特有的方法call
         */
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();

            if (usbs[i] instanceof Phone_) {
                Phone_ p = (Phone_) usbs[i];
                p.call();//向下转型
//                ((Phone_)usbs[i]).call();
            }

            if (usbs[i] instanceof Camera_) {
                ((Camera_) usbs[i]).call();
            }
        }

    }
}

interface Usb {
    void work();
}

class Phone_ implements Usb {
    @Override
    public void work() {
        System.out.println("手机工作中");
    }

    public void call() {
        System.out.println("手机正在打电话");
    }
}

class Camera_ implements Usb {
    @Override
    public void work() {
        System.out.println("相机工作中");
    }

    public void call() {
        System.out.println("相机正在打拍照");
    }
}
