import java.util.Arrays;
import java.util.Random;
public class AnswerGenerator {
    /**
     * 产生随机数
     * @return temp  按位拆分后的随机数
     * */
    public  int RandNum(){
        int max = (int) Math.pow(10, 4);
        int min = (int) Math.pow(10,4-1);
        Random rand = new Random();
        int randNum=0;
        int []bs;
        int n=0;
        m1:
        while(true){
            //产生numLength位的随机数
            n=rand.nextInt(max)%(max-min+1)+min;
            if(Util.IsMultiNumber(n,4)){
                continue m1;
            }
            break;
        }
        return n;
    }
}
