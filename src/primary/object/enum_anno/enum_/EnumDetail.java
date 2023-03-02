package primary.object.enum_anno.enum_;

/**
 * @author 彭桂涛
 * @version 1.0
 */
public class EnumDetail {
    //1.使用enum关键字后，就不能再继承其他类了，因为enum默认继承Enum类
    //2.enum实现的枚举类，仍然是一个类，所以还是可以实现接口的
    public static void main(String[] args) {
        Music.CLASSICMUSIC.playing();
    }
}

interface IPlaying {
    void playing();
}

enum Music implements IPlaying {
    CLASSICMUSIC;//枚举对象

    @Override
    public void playing() {
        System.out.println("播放音乐");
    }
}
