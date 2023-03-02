package medium.thread.homework;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Cpu {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNums = runtime.availableProcessors();
        System.out.println("cpu核数为："+cpuNums);
    }
}
