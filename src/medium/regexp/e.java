package medium.regexp;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class e {
    static int X = 6;
    static int Y = 6;
    static int[][] chessBoard = new int[Y][X];
    public static boolean[] visited = new boolean[Y * X];
    static boolean finish = false;

    public static void main(String[] args) {
        int row = 3;
        int col = 2;
        long start = System.currentTimeMillis();
        TCB(chessBoard, row - 1, col - 1, 1);
        long end = System.currentTimeMillis();
        System.out.println("所用时间为=" + (end - start));

        for (int[] rows : chessBoard) {
            for (int step : rows) {
                System.out.print(step + "\t");
            }
            System.out.println();
        }
    }

    public static void TCB(int[][] chessBoard, int row, int col, int step) {
        chessBoard[row][col] = step;
        visited[row * X + col] = true;

        ArrayList<Point> ps = next(new Point(col, row));
        while (!ps.isEmpty()) {
            Point p = ps.remove(0);

            if (!visited[p.y * X + p.x]) {
                TCB(chessBoard, p.y, p.x, step + 1);
            }
        }

        if (step < X * Y && !finish) {
            chessBoard[row][col] = 0;
            visited[row * X + col] = false;
        } else {
            finish = true;
        }
    }

    public static ArrayList<Point> next(Point curPoint) {
        ArrayList<Point> ps = new ArrayList<Point>();

        Point p1 = new Point();

        if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));
        }

        if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));
        }

        // 判断是否可以走7这个位置,如果可以就创建一个新的point 对象，并放入到ArrayList
        if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));
        }

        // 判断是否可以走0这个位置,如果可以就创建一个新的point 对象，并放入到ArrayList

        if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));
        }

        // 判断是否可以走1这个位置,如果可以就创建一个新的point 对象，并放入到ArrayList
        if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));
        }

        // 判断是否可以走2这个位置,如果可以就创建一个新的point 对象，并放入到ArrayList
        if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));
        }

        // 判断是否可以走3这个位置,如果可以就创建一个新的point 对象，并放入到ArrayList
        if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));
        }
        // 判断是否可以走4这个位置,如果可以就创建一个新的point 对象，并放入到ArrayList
        if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));
        }

        return ps;
    }

}
