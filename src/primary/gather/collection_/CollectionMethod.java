package primary.gather.collection_;

import java.util.ArrayList;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class CollectionMethod {
    //说明：以ArrayList实现类来演示.
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//        add:添加单个元素
        list.add("jack");
        list.add(10);//list.add(new Integer(10))
        list.add(true);
        System.out.println("list=" + list);

//        remove:删除指定元素
        //list.remove(0);//删除第一个元素
        list.remove(true);//指定删除某个元素
        list.remove(1);//指定删除某个元素的下标
        System.out.println("list=" + list);

//        contains:查找元素是否存在
        System.out.println(list.contains("jack"));//T

//        size:获取元素个数
        System.out.println(list.size());//1

//        isEmpty:判断是否为空
        System.out.println(list.isEmpty());//F

//        clear:清空
        list.clear();
        System.out.println("list=" + list);

//        addAll:添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("list=" + list);

//        containsAll:查找多个元素是否都存在
        System.out.println(list.containsAll(list2));//T

//        removeAll：删除多个元素
        list.add("聊斋");
        list.removeAll(list2);
        System.out.println("list=" + list);//[聊斋]

    }
}

