package base.objectExercise.exercise;

public class Exercise07 {
    public static void main(String[] args) {
        //练习7.用equals判断两个对象是否相等,相等就是判断两个对象的属性是否相同
        Doctor d1 = new Doctor("大明", 30, "牙科医生", '男', 4000);
        Doctor d2 = new Doctor("大明", 30, "牙科医生", '男', 4000);
        System.out.println(d1.equals(d2));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;

    public Doctor(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    public char getGender() {
//        return gender;
//    }
//
//    public void setGender(char gender) {
//        this.gender = gender;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Doctor)){
            return false;
        }
        Doctor doctor = (Doctor)obj;
        return this.name.equals(doctor.name)&&this.age == doctor.age && this.job.equals(doctor.job)&&
                this.gender == doctor.gender&&this.salary == doctor.salary;
    }

}