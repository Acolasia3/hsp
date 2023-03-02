/**
 * @author 彭桂涛
 * @version 1.0
 */


public class Tree {
    public static void main(String[] args) {
        String endColor = "\u001b[0m";
        String startYellowBack = "\033[43m";
        String endBack = "\033[m";
        String startGreen = "\033[32m";
        String startRed = "\033[31m";
        int height = 8;
        int rootHeight = 3;
        int blank = height + 50;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i * 2; z++) {
                if (z % 2 == 0) {
                    System.out.print(startGreen + "*" + endColor);
                } else {
                    System.out.print(startRed + "*" + endColor);
                }
            }
            System.out.println();
            blank--;
        }

        for (int i = 0; i < rootHeight; i++) {
            for (int j = 0; j < height + 48; j++) {
                System.out.print(" ");
            }
            System.out.println(startYellowBack + " # # " + endBack);
        }
    }
}
