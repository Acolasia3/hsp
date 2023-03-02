package base.oop.digui;

public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        //最下面和最上面一行设置为1
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 7; j++) {
//                map[0][i] = 1;
//                map[7][i] = 1;
//                map[i][0] = 1;
//                map[i][6] = 1;
//            }
//        }
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;

        //回溯(走不通回到最初位置)
//        map[2][2] = 1;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        T t = new T();
        t.findWay(map, 1, 1);//定义初始位置 （递归）
        System.out.println("\n =====路径====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class T {
    //1.findWay是专门找迷宫的路径
    //2.map就是二维数组,表示迷宫
    //3.i,j就是老鼠的位置,初始化位置(1,1)
    //4. 0表示可以走,1表示障碍物,2表示可以走,3表示走过但走不通
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                //下右上左,上右下左（递归操作）
                if (findWay(map, i + 1, j)) {//下
                    return true;
                } else if (findWay(map, i, j + 1)) {//右
                    return true;
                } else if (findWay(map, i - 1, j)) {//上
                    return true;
                } else if (findWay(map, i, j - 1)) {//左
                    return true;
                } else {
                    map[i][j] = 3;
                }

            } else {//map[i][j] = 1,2,3
                return false;
            }
        }
        return false;
    }
}
