package medium.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class e1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException, InvocationTargetException {
        Class<?> aClass = Class.forName("medium.reflection.PrivateTest");
        Object o = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
//        name.set(o,"tao");
        System.out.println(o);
        System.out.println(name.get(o));

        Method name1 = aClass.getDeclaredMethod("getName");
        System.out.println(name1.invoke(o));
    }
}

class PrivateTest {
    private String name = "hellokitty";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PrivateTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
