package base.object.extend.exercise.computer;

public class notePad extends Computer{
    private String color;
    public notePad(String cpu, int memory, int disk,String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Info(){
        System.out.println("notePad信息如下");
        System.out.println(getDetail()+" color:"+color);
    }
}
