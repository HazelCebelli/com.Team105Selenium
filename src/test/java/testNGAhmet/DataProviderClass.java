package testNGAhmet;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name="NameInformation")
    public Object[][] getData(){

        return new Object[][]{   {"Ahmet","Baldir", "Ahmet Baldir"}  ,
                {"Ahmet1","Baldir1", "Ahmet1 Baldir1"} ,
                {"Ahmet2","Baldir2", "Ahmet2 Baldir2"} ,
                {"Ahmet3","Baldir3", "Ahmet3 Baldir3"} };
    }

    @DataProvider(name = "SentrifugoLogin")
    public Object [][] getLoginData(){
        return new Object[][]{
                {"EM01","sentrifugo"},
                {"EM02","sentrifugo"},
                {"EM03","sentrifugo"},
                {"EM04","sentrifugo"},
                {"EM05","sentrifugo"},
                {"EM06","sentrifugo"},
                {"EM07","sentrifugo"},
                {"AGCY8","sentrifugo"},
                {"US09","sentrifugo"}
        };
    }

}
