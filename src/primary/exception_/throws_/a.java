package primary.exception_.throws_;

public class a {
    public static void main(String[] args) {
        int n = 1;
        int n2 = 0;
        int n3 = n/n2;
        if(n3!=0) {
            throw new b("分母不能为0");
        }
    }
}
class b extends RuntimeException{
    public b(String message) {
        super(message);
    }
}
