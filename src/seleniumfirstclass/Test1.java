package seleniumfirstclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/baby-reg/homepage?ref_=nav_ListFlyout_gno_listpop_br");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		}

}
