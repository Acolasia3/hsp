package base.object.extend.exercise.computer;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("Intel", 16, 512, "IBM");
        pc.printInfo();
        System.out.println("==============================================");
        notePad notePad = new notePad("Intel", 32, 256, "黑色");
        notePad.Info();
    }
}
