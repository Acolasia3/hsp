package medium.thread.method;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise {
    public static void main(String[] args) throws InterruptedException {
        m m = new m();
        Thread thread = new Thread(m);
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
            if (i == 5) {
                System.out.println("让子线程先执行");
                thread.start();
                thread.join();
            }
        }
        System.out.println("主线程结束");
    }
}

class m implements Runnable {
    @Override
    public void run() {
        int count = 1;
        boolean loop = true;
        while (loop) {
            System.out.println("hello " + count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count > 10) {
                System.out.println("子线程结束");
                loop = false;
            }
        }
    }


}
