package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority = 1,invocationCount = 2)
	public void calls() {
		Reporter.log("calls",true);
	}
	@Test(invocationCount = 5,enabled=false)
	public void chats() {
		Reporter.log("chats",true);
	}
	@Test(priority = -1,invocationCount = 3)
	public void status() {
		Reporter.log("status",true);
	}
	}

