package primary.string_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class StringExercise05 {
    public static void main(String[] args) {
        Text t = new Text();
        t.change(t.str, t.ch);//创建change栈
        //main调用的还是原来构造器中的值
        System.out.println(t.str + " and");
        System.out.println(t.ch);
    }
}

class Text {
    //t.str调用构造器
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]) {//执行完就销毁了
        str = "java";
        ch[0] = 'h';
        System.out.println(str);
    }
}
