package primary.object.enum_anno.enum_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        System.out.println("===所有星期的信息如下===");
        Week[] values = Week.values();
        for (Week i : values) {
            System.out.println(i);
        }
    }
}

enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private String day;

    Week(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return day;
    }
}
