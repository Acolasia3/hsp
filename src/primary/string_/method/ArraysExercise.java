package primary.string_.method;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("java从入门到放弃", 300);
        books[2] = new Book("青年文摘20年", 50);
        books[3] = new Book("金瓶梅新", 90);

        //通过price从大到小排序
     /*   Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceVal = book2.getPrice() - book1.getPrice();
                if (priceVal > 0) {
                    return 1;
                } else if (priceVal < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });*/

        //通过price小到大排序
       /* Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceVal = book1.getPrice() - book2.getPrice();
                if (priceVal > 0) {
                    return 1;
                } else if (priceVal < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });*/

        //通过name的长度从少到多排序
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                int NameVal = book1.getName().length() - book2.getName().length();
                if (NameVal > 0) {
                    return 1;
                } else if (NameVal < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));

    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}