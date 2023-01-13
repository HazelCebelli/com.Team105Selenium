package BrowserUtils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverHelper {

    //private variable
    private static WebDriver driver;
    String browser="chrome";

    //private constructor to make sure someone else not create an object from this class
    private DriverHelper(){}

    //method
    public static WebDriver getDriver(){


// if my driver is not instantiated before
        if(driver==null ||((RemoteWebDriver)driver).getSessionId()==null){
            switch(ConfigReader.readProperty("browser")){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;

        } driver.manage().window().maximize();
    } return driver;


    }
}

