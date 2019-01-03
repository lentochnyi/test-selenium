import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.*;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class MyFrstTest {

    private WebDriver myDriver;
    private WebDriverWait myWait;



    @Before
    public void start(){

        ///System.setProperty("webdriver.chrome.driver", "C:/Selenium-test/chromedriver.exe");
        myDriver = new ChromeDriver();
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myWait = new WebDriverWait(myDriver, 10);

    }

    @Test
    public void myFrstTest(){
        ///myDriver.get("http://www.google.com");
        myDriver.navigate().to("http://www.google.com");
        myDriver.findElement(By.name("q")).sendKeys("webdriver");
        myDriver.findElement(By.name("btnK")).click();
        myWait.until(titleIs("webdriver - Поиск в Google"));
    }

    @After
    public void stop(){
        myDriver.quit();
        myDriver = null;
    }
}
