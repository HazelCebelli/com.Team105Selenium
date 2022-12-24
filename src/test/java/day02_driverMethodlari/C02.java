package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {
    public static void main(String[] args) throws InterruptedException {


      System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
    //windiws kullananlarin sonuna exe olamli mac icin gerek yok

    WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        Thread.sleep(5000);

        driver.manage().window().fullscreen();
        System.out.println(driver.manage().window().getSize());
        Thread.sleep(5000);



        //browseri istedigimiz boyuta ve konuma getirme
        driver.close();





}}
