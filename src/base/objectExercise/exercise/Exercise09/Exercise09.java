package base.objectExercise.exercise.Exercise09;

public class Exercise09 {
    public static void main(String[] args) {
        Tc tc = new Tc("大明", 30, '男', 5);
        tc.workInfo();
        System.out.println("=============================");

        Stu stu = new Stu("小明", 15, '男', "0023102");
        stu.playInfo();

        System.out.println("\n");
        Per[] per = new Per[4];
        per[0] = new Tc("大李", 30, '男', 5);
        per[1] = new Tc("大黄", 25, '男', 3);
        per[2] = new Stu("小彭", 15, '男', "0023102");
        per[3] = new Stu("小涛", 20, '男', "21120542");

        System.out.println("=======排序后的数组========");
        Exercise09 e = new Exercise09();
        e.Info(per);

        for (int i = 0; i < per.length; i++) {
            System.out.println(per[i]);
        }

        System.out.println("=========================");
        //调用子类特有的方法
        for (int i = 0; i < per.length; i++) {
            e.test(per[i]);
        }
    }

    public void Info(Per[] per) {
        Per temp = null;
        for (int i = 0; i < per.length - 1; i++) {
            for (int j = 0; j < per.length - 1 - i; j++) {
                if (per[j].getAge() < per[j + 1].getAge()) {
                    temp = per[j];
                    per[j] = per[j + 1];
                    per[j + 1] = temp;
                }
            }
        }
    }

    public void test(Per p){
        if(p instanceof Stu){
            ((Stu) p).study();
        }else if(p instanceof Tc){
            ((Tc) p).teach();
        }
    }
}
