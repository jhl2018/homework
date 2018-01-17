import java.util.Arrays;

public class Util {
    /**
     * 分割数字为数组
     */
    public static int[] splitNum(int number,int numLen){
        int []bs = new int[numLen];
        //将随机数按位拆分，以供后续比较是否存在重复数字
        for(int i=bs.length-1;i>=0;i--){
            bs[i]=number%10;
            number/=10;
        }
        return bs;
    }
    /*
    * 判断是否存在重复数字
    * 存在重复数字时返回true
    * */
    public static boolean IsMultiNumber(int number,int numLen){
        boolean result = false;
        int []bs = splitNum(number,numLen);
        //判断是否存在重复的数字
        Arrays.sort(bs);
        for(int i=0;i<bs.length;i++){
            for(int j=0;j<bs.length;j++)
                if(bs[i]==bs[j]&& i!=j){
                    result = true;
                }
        }
        return result;
    }
    public static boolean isAllEquall(String result){
        boolean isAll = false;
        if(result.substring(0,1).equals("4")){
            isAll = true;
        }
        return isAll;
    }
}
