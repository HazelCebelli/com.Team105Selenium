package BrowserUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserUtilss {

    public static void selectBy(WebElement element, String value, String methodName){
        Select select=new Select(element);

        switch (methodName){
            case "text":
                select.selectByVisibleText(value);
                break;
            case "value":
                select.selectByValue(value);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;

        }
    }
    public static String getTitleJS(WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        return js.executeScript("return document.title").toString();
    }
    public static void clickWithJS(WebDriver driver, WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",element);
    }

    public static void scrollWithJS(WebDriver driver, WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",element);
    }


}
