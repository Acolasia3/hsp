package primary.object.static_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("唐探3");
        Movie movie2 = new Movie("唐探3",100);
        Movie movie3 = new Movie("唐探3",100,"陈思诚");
    }
}
class Movie {
    private String name;
    private double price;
    private String director;

    //1.下面三个构造器都有相同的语句显得很冗余，我们只要把他们放入一个代码块中即可
    //2.当我们不管调用那个构造器、创建对象，都会先调用代码块的内容
    {
        System.out.println("电影正在播放");
        System.out.println("电影结束");
    };

    //3个构造器 --> 重载
    public Movie(String name) {
        System.out.println("Movie(String name) 被调用");
    }

    public Movie(String name, double price) {
        System.out.println("Movie(String name, double price) 被调用");
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director) 被调用");
    }

}
