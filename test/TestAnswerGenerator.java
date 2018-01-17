import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestAnswerGenerator {
    @Test
    public void testIsMuti(){
        boolean result = Util.IsMultiNumber(1234,4);
        assertThat(result, is(false));
    }
    @Test
    public void testRand(){
        AnswerGenerator rand=new AnswerGenerator();
        int result = rand.RandNum();
        assertThat(result,is(0000));
    }
    @Test
    public void testCompareNumber(){
        CompareNumber testCN=new CompareNumber();
        String result = testCN.ValiNnumber(1234,4321);
        assertThat(result,is("0A4B"));
    }
}
