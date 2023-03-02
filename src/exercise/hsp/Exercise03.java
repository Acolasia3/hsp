package exercise.hsp;

public class Exercise03 {
    public static void main(String[] args) {
        int[][] arr = new int[8][7];
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[2][2] = 1;
        for (int i = 0; i < 7; i++) {
            arr[0][i] = 1;
            arr[7][i] = 1;
        }
        for (int j = 1; j < 7; j++) {
            arr[j][0] = 1;
            arr[j][6] = 1;
        }


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
        M m = new M();
        m.findWay(arr, 1, 1);//初始地点
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class M {
    public boolean findWay(int[][] arr, int i, int j) {
        if (arr[6][5] == 2) {
            return true;
        } else {
            if (arr[i][j] == 0) {
                arr[i][j] = 2;
                if (findWay(arr, i + 1, j)) {
                    return true;
                } else if (findWay(arr, i, j + 1)) {
                    return true;
                } else if (findWay(arr, i - 1, j)) {
                    return true;
                } else if (findWay(arr, i, j - 1)) {
                    return true;
                } else {
                    arr[i][j] = 3;//递归回溯
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
