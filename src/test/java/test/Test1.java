package test;

import org.testng.annotations.Test;


import generics.BaseTest;
import pom.PomactitimeLoginPage;

public class Test1 extends BaseTest {

	
	@Test
	public  void enter() {
	PomactitimeLoginPage pom=new PomactitimeLoginPage(driver);
	pom.loginMethod();
	
	}

}
