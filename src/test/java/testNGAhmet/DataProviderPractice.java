package testNGAhmet;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

//    @DataProvider(name="NameInformation")
//    public Object[][] getData(){
//
//        return new Object[][]{   {"Ahmet","Baldir", "Ahmet Baldir"}  ,
//                {"Ahmet1","Baldir1", "Ahmet1 Baldir1"} ,
//                {"Ahmet2","Baldir2", "Ahmet2 Baldir2"} ,
//                {"Ahmet3","Baldir3", "Ahmet3 Baldir3"} };
//    }


    @Test(dataProvider = "NameInformation", dataProviderClass = DataProviderClass.class)
    public void dataProviderTest( String firstName,String lastName,String expectedFullName){
    String fullname=firstName+" "+lastName;
        Assert.assertEquals(fullname,expectedFullName);
        //t
    }
}
