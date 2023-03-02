package primary.generic.exercise;

import java.util.ArrayList;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class e {
    private String name;
    private double sal;
    private String birthday;

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "e{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday='" + birthday + '\'' +
                '}';
    }


}

class MD {
    private int month;
    private int day;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Test {
    public static void main(String[] args) {
        ArrayList<MD> mds = new ArrayList<>();
        MD md = new MD();

        for (Object o :mds) {

        }

    }
}
