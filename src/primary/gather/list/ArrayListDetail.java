package primary.gather.list;

import java.util.ArrayList;
/**
 * @author 彭桂涛
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ArrayListDetail {
    public static void main(String[] args) {
        //512集（重点）
        //老韩解读源码
        //注意，注意，注意，Idea 默认情况下，Debug 显示的数据是简化后的，如果希望看到完整的数据
        //需要做设置.
        //使用无参构造器创建ArrayList对象
        //无参创建时，默认10，超过
        ArrayList list = new ArrayList();
//        ArrayList list = new ArrayList(8);

        //使用for给list集合添加 1-10数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //ArrayList没有使用cynchronized,多线程不建议使用，多线程建议Vector
        /*
        public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
        }*/

        //使用for给list集合添加 11-15数据
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
        System.out.println(list);
    }
}
