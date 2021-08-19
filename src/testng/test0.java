package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test0 {
   @Test
   public void demo() {
	   Reporter.log("Hello world",true);
	   Reporter.log("hello universe",false);
   }
}
