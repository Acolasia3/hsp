package primary.exception_.execrise;

public class E1 {
    public static void main(String[] args) {
        try {
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1,n2);
            System.out.println("计算结果为"+res);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

    public static int cal(int n1,int n2){
        return n1/n2;
    }
}
