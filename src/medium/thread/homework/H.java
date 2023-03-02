package medium.thread.homework;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class H {
    int money = 10000;

    public static void main(String[] args) {
//        L l = new L();
//        Thread t1 = new Thread(l);
//        Thread t2 = new Thread(l);
//        t1.setName("t1");
//        t2.setName("t2");
//        t1.start();
//        t2.start();
        H h = new H();
        F f = new F(h);
        G g = new G(h);
        f.setName("f");
        g.setName("g");
        f.start();
        g.start();

    }
}

//class L implements Runnable {
//    int money = 10000;
//
//    @Override
//    public void run() {
//        while (true) {
//            synchronized (this) {
//                if (money <= 0) {
//                    System.out.println("余额不足");
//                    break;
//                }
//
//                money -= 1000;
//                System.out.println(Thread.currentThread().getName() + "取款1000 总额剩余" + money);
//            }
//
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
class F extends Thread {
    H h = new H();

    public F(H h) {
        this.h = h;
    }

    @Override
    public void run() {
        while (true) {
            if (h.money <= 0) {
                System.out.println("余额不足");
                break;
            }
            h.money -= 1000;
            System.out.println(Thread.currentThread().getName() + "取款1000 总额剩余" + h.money);
try {
Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class G extends Thread {
    H h = new H();

    public G(H h) {
        this.h = h;
    }

    @Override
    public void run() {
        while (true) {
            if (h.money <= 0) {
                System.out.println("余额不足");
                break;
            }
            h.money -= 1000;
            System.out.println(Thread.currentThread().getName() + "取款1000 总额剩余" + h.money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}