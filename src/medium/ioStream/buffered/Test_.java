package medium.ioStream.buffered;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class Test_ {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
//        bufferedReader_.readFiles(10);
//        bufferedReader_.readFile();
        bufferedReader_.read(5);
        //Serializable   标记接口，没有方法（推荐）
        //Externalizable   接口有方法需要实现
        //ObjectInputStream
        //ObjectOutputStream
        //这次希望通过 BufferedReader_ 多次读取字符串
        BufferedReader_ bufferedReader_2 = new BufferedReader_(new StringReader_());
//        bufferedReader_2.readStrings(5);
        bufferedReader_2.read(10);
    }
}
