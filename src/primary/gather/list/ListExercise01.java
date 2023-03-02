package primary.gather.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author 彭桂涛
 * @version 1.0
 */
public class ListExercise01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + i);
        }
        System.out.println("list=" + list);

        //获取下标
        System.out.println("第五个元素=" + list.get(4));

        //添加元素
        list.add(1, "韩顺平教育");
        System.out.println(list);

        //删除元素
        list.remove(5);
        System.out.println(list);

        //修改元素
        list.set(6, "三国");
        System.out.println(list);

        System.out.println("==============使用迭代器==============");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println("obj=" + object);
        }
    }
}
