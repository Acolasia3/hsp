package primary.gather.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        //1.void add(int index, Object ele):在index位置插入ele元素
        //在index = 1的位置插入一个对象
        list.add(1, "韩顺平");
        System.out.println("list=" + list);

        //2.boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list=" + list);

        //3.Object get(int index):获取指定index位置的元素
        System.out.println(list.get(1));

        //4.int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));

        //5.int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        list.add("韩顺平");
        System.out.println("list=" + list);
        System.out.println(list.lastIndexOf("韩顺平"));

        //6.Object remove(int index):移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println("list=" + list);

        //7.Object set(int index, Object ele):设置指定index位置的元素为ele , 相当于是替换.
        list.set(1, "玛丽");
        System.out.println("list=" + list);

        //8.List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
        //  注意返回的子集合 fromIndex <= subList < toIndex (左闭右开)
        List returnlist = list.subList(0, 2);//[0,2)
        System.out.println("returnlist=" + returnlist);

    }
}
