package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverMEthodalri {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        //windiws kullananlarin sonuna exe olamli mac icin gerek yok

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);

//acilan sayfanin basliginin amazon icerdigini test edin;
        String expectedKelime="amazon";
        String actualResult=driver.getTitle();

        if(actualResult.contains(expectedKelime)){
            System.out.println("+");
        }
        else{
            System.out.println("-");
            System.out.println(driver.getTitle());
        }

        System.out.println("+++++++++++++++");


//gittigimiz sayfanin amazon.com oldugunu test edin
        String expectedUrl="https://www.amazon.com/";
        String actualURL=driver.getCurrentUrl();

        if(expectedUrl.equals(actualURL)){
            System.out.println("+");
        }
        else{
            System.out.println("-");
            System.out.println(driver.getCurrentUrl());
        }


        driver.close();



    }
}
