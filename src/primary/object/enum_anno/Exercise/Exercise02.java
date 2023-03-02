package primary.object.enum_anno.Exercise;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Exercise02 {
}

class Frock {
    private static int currentNum = 100000;
    public int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    @SuppressWarnings({"all"})

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}

class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock f1 = new Frock();
        Frock f2 = new Frock();
        Frock f3 = new Frock();
        System.out.println(f1.getSerialNumber());
        System.out.println(f2.getSerialNumber());
        System.out.println(f3.getSerialNumber());
    }
}