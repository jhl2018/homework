import java.util.Scanner;

public class CompareNumber {
    public String ValiNnumber(int randNum,int input){
        StringBuffer str=new StringBuffer();
        int randNumSplit[]=Util.splitNum(randNum,4);
        int inputSplit[]=Util.splitNum(input,4);
        int a=0,b=0;
        for(int i=0;i<4;i++){
            if(randNumSplit[i]==inputSplit[i]){
                a=a+1;
            }else{
                b=b+1;
            }
        }
        str.append(a+"A"+b+"B");
        return str.toString();
    }
}
