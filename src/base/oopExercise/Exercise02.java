package base.oopExercise;

public class Exercise02 {
    public static void main(String[] args) {
        //练习3
        Book book = new Book("灌篮高手", 200);
        book.info();
        book.updatePrice();//更新
        book.info();
    }
}

class Book {
    String name;
    int price;

    public Book(String name, int price) {
        this.name = name;//把构造器的数据传给属性
        this.price = price;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
    }

    public void info() {
        System.out.println("书名" + this.name + ",价格" + this.price);
    }
}

//传参调用
/*
public class E1 {
    public static void main(String[] args) {
        int book = 120;
        Book b = new Book();
        System.out.println(b.updatePrice(book));

    }

}

class Book {
    public int updatePrice(int book) {
        if (book > 150) {
            return 150;
        }
        if (book > 100) {
            return 100;
        }
        return -1;

    }
}

 */
