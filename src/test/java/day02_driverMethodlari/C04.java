package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");

        String pageSource=driver.getPageSource();
        String expectedPageSource="MEOW";

        if(pageSource.contains(expectedPageSource)){
            System.out.println("+");
        }else{
            System.out.println("-");
        }






        Thread.sleep(5000);
        driver.close();
    }
}
