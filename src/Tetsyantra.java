import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tetsyantra {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
     
      driver.manage().window().maximize();
      driver.get("https://www.flipkart.com/");
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.findElement(By.id("q")).sendKeys("TV");
      driver.findElement(By.linkText("submit")).click();
      
	}

}
