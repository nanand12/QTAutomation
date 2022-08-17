package selenium.QTAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import org.testng.annotations.test;

public class TestNGImplementation {
	@Test
	void amultiple() {
		System.out.println("i am ");
		
	}
	@Test
	void calc() {
		System.out.println("run away");
	}
	@BeforeMethod
	void run() {
		System.out.println("I can run");
	}
	@AfterMethod
	void skip() {

		System.out.println("I can skip");
	}
	@BeforeClass
	void sleep() {
		System.out.println("Sleeping");
	}
	@AfterClass
	void wake() {
		System.out.println("I am awake");
	}

}
