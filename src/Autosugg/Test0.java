package Autosugg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.co.in/");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.name("q")).sendKeys("AM");
     driver.findElement(By.linkText("azon india")).click();
     driver.findElement(By.linkText("Shop Online on Amazon - Get the best deals on Amazon")).click();
     
	}

}
