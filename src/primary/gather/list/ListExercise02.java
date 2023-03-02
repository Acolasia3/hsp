package primary.gather.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦", 30, "曹雪芹"));
        list.add(new Book("西游记", 50, "吴承恩"));
        list.add(new Book("水浒传", 60, "施耐庵"));
        list.add(new Book("三国演义", 40, "罗贯中"));

        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("===================排序=======================");
        //冒泡排序
        sort(list);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void sort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}

class Book {
    String name;
    double price;
    String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return
                "名称:" + name + "\t\t" +
                        "价格:" + price + "\t\t" +
                        "作者:" + author + "\t\t";
    }
}