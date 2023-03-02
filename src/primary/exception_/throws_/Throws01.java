package primary.exception_.throws_;

import java.nio.file.FileAlreadyExistsException;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class Throws01 {
    public static void f1() {
        try {
            f2();
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        }
    }

    public static void f2() throws FileAlreadyExistsException {
        //1.对于编译异常，程序中必须处理，比如try-catch和throws
        //2.对于 （运行异常） 时，程序中如果没有处理，默认使用throws的方式处理,
        //  如果为编译异常时，就必须要处理异常
        //3.子类重写父类的方法时，对抛出异常的规定：子类重写的方法，所抛出的异常类型
        //  要么和父类抛出的异常一致，要么为父类抛出的异常的类型的子类型
        //4.f1()方法可以throws向上抛出也可以try-catch
        //4.在throws过程中，如果有方法try-catch，就相当于处理异常，就可以不必throws
    }

}

class Father {
    public void f3() throws RuntimeException {

    }
}

class Son extends Father {
    @Override
    public void f3() throws NullPointerException {

    }
}
