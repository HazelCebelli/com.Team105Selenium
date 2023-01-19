package testNGAhmet;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {

    @Parameters("")

    @Test
    public void test(String name){  // TestNG Exception

        System.out.println(name);
    }
}
