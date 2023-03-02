package medium.thread.homework;

import java.util.Scanner;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class h1 {
    public static void main(String[] args) {
//        N n = new N();
//        M m = new M();
//        n.start();
//        m.start();
//        m.setN(n);
        P p = new P();
        p.setDaemon(true);
        p.start();
        System.out.println("请输入指令");
        while(true) {
            Scanner scanner = new Scanner(System.in);
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                System.out.println("线程p结束");
                return;
            }
        }
    }
}

//class N extends Thread {
//    public boolean loop = true;
//
//    @Override
//    public void run() {
//        while (loop) {
//            System.out.println((int) (Math.random() * 100));
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("线程n结束");
//    }
//
//    public void setLoop(boolean loop) {
//        this.loop = loop;
//    }
//}

//class M extends Thread {
//    private N n;
////    public M(N n) {
////        this.n = n;
////    }
//    public void setN(N n) {
//        this.n = n;
//    }
//
//    @Override
//    public void run() {
//        System.out.println("请输入你的指令");
//
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            char key = scanner.next().toUpperCase().charAt(0);
//            System.out.println("错误，请重新输入指令");
//            if (key == 'Q') {
//                System.out.println("线程m结束");
//                n.setLoop(false);
//                break;
//            }
//        }
//    }
//}
class P extends Thread {
    @Override
    public void run() {
        synchronized (this){
            for (;;) {
                int nums = (int)(Math.random()*100);
                System.out.println(nums);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}