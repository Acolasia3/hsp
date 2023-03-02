package primary.gather.collection_;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Collection01 {
    public static void main(String[] args) {
        /*
            1.集合主要是两组（单列集合、双列集合）
            2.Collection接口有两个重要的子接口List Set，他们的实现子类都是单列集合
            3.Map接口的实现子类是双列集合，存放的K-V

         */
        //存放单个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");

        //存放两个元素
        HashMap hashMap = new HashMap();
        hashMap.put("1","hsp");
        hashMap.put("2","tao");
    }
}
