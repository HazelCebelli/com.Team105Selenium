package testNGAhmet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssortion {

    public int getMulti(int number1,int number2){
        return number1*number2;
    }

    @Test
    public void valiateMultiplication(){
        int actualResult=getMulti(-2,4);
        int expectedResult=-6;

        Assert.assertEquals(actualResult,expectedResult);
    }



}
