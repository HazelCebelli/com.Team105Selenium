package testNGAhmet;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotationGUZELOGRETICI {

    @Parameters("FirstName")

    @Test
    public void test(String name){  // TestNG Exception throws

        System.out.println(name);
    }

    @Parameters({"countryname", "statee", "zip"})  // order has to match

    @Test
    public void test2(String country, String state, String  zipcode){
        System.out.println(country+ " "+state+ " "+ zipcode);
    }
}
