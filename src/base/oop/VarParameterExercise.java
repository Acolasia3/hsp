package base.oop;

public class VarParameterExercise {
    //名字和多个分数的总分
    public static void main(String[] args) {
        HspMethod h = new HspMethod();
        System.out.println(h.showScore("涛",90,100,80));
    }
}

class HspMethod{
    public String showScore(String name,double... scores){
        double totalScore = 0;
        for (int i = 0; i < scores.length; i++) {
            totalScore +=  scores[i];
        }
        return name+":" + scores.length+"门课的成绩总分为="+totalScore;
    }
}
