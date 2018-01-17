import java.util.Scanner;

public class Guess {
    CompareNumber compareNumber = new CompareNumber();
    AnswerGenerator answerGenerator = new AnswerGenerator();
    public void guessGame(){
        int count = 6;
        Scanner sc=new Scanner(System.in);
        int input=0;
        int random=0;
        m1:
        while(count>0){
            System.out.println("please input your number("+count+"）");
            input = sc.nextInt();
            if(Util.IsMultiNumber(input,4)){
                System.out.println("Cannot input duplicate numbers!");
                continue m1;
            }else{
                random = answerGenerator.RandNum();
                String result = compareNumber.ValiNnumber(random,input);
                if(Util.isAllEquall(result)){
                    break;
                }else{
                    System.out.println(result);
                    System.out.println();
                    count--;
                }
            }
        }
        if(count!=0){
            System.out.println("Congratulations");
        }else {
            System.out.println("Game over");
        }
    }
    public static void main(String []args){
        Guess guess = new Guess();
        guess.guessGame();
    }
}
