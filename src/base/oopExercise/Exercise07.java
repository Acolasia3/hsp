package base.oopExercise;

public class Exercise07 {
    public static void main(String[] args) {
        //练习8
        Music music = new Music("直到世界尽头",200);
        music.play();
        System.out.println(music.getInfo());
    }
}
class Music{
    String name;
    int times;

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play(){//返回值为空
        System.out.println("音乐:"+name+" 时长为"+times+"秒");
    }
    public String getInfo(){//返回值为字符串
        return "音乐:"+name+" 时长为"+times+"秒";
    }
}