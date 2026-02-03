package testNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@Test
	public void sampleTestCase() {
		System.out.println("This is a sample test");
	}
	@BeforeMethod
	public void sampleBeforeMethod() {
		System.out.println("This is a sample before method");
	}
	@AfterMethod
	public void sampleAfterMethod() {
		System.out.println("This is a sample after method");
	}
	@BeforeClass
	public void sampleBeforeClass() {
		System.out.println("This is a sample before class");
	}
	@AfterClass
	public void sampleAfterClass() {
		System.out.println("This is a sample after class");
	}
	@BeforeTest
	public void sampleBeforeTest() {
		System.out.println("This is a sample before test");
	}
	@AfterTest
	public void sampleAfterTest() {
		System.out.println("This is a sample after test");
	}
	@BeforeSuite
	public void sampleBeforeSuite() {
		System.out.println("This is a sample before suite");
	}
	@AfterSuite
	public void sampleAfterSuite() {
		System.out.println("This is a sample after suite");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
