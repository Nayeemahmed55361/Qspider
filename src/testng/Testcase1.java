package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase1 {
     public WebDriver driver;
     @BeforeMethod
     public void openApp() {
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.facebook.com/");
    	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	 
     }
     @Test
     public void login() {
    	 driver.findElement(By.linkText("English (UK)")).click();
    	 driver.findElement(By.id("email")).sendKeys("sdkjhdskch");
    	 driver.findElement(By.id("pass")).sendKeys("sdscsec");
    	 driver.findElement(By.name("login")).click();
    	 Reporter.log(driver.getTitle(),true);
    	 Reporter.log(driver.getCurrentUrl(),true);
     }
     @AfterMethod
     public void closeapp() {
    	 driver.close();
     }
}
