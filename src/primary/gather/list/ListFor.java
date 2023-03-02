package primary.gather.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //三种遍历方法
        //List 接口的实现子类 Vector LinkedList
        //迭代器
        System.out.println("===迭代器===");
        List list = new ArrayList();
//        List list2 = new Vector();
        list.add("tao");
        list.add("qin");
        list.add("lin");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

        //2.增强for
        System.out.println("===增强for===");
        for (Object o : list) {
            System.out.println(o);
        }

        //3.普通for
        System.out.println("===普通for===");
        for (int i = 0; i < list.size(); i++) {
            Object value = list.get(i);
            System.out.println(value);
        }

    }
}
