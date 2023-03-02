package primary.string_.stringbuffer;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        //1.增
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append(true).append(10.5);
        System.out.println(s);

        //2.删
        s.delete(11,15);//[11,15)
        System.out.println(s);

        //3.改
        s.replace(9,11,"周芷若");
        System.out.println(s);

        //4.查
        int indexof = s.indexOf("张三丰");
        System.out.println(indexof);

        //5.插
        s.insert(9,"赵敏");
        System.out.println(s);

        //6.长度
        System.out.println(s.length());
    }
}
