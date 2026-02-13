package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import testNGBasics.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase {
	@Test
	public void verifyUserWithValidCredentials() throws IOException {
	
		String usernameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage page=new LoginPage(driver);
		page.enterUsernameOnUsernameField(usernameValue);
		page.enterPasswordOnPasswordField(passwordValue);
		page.clickOnLoginButton();
	}
	@Test
	public void verifyUserWithValidUsernameAndInvalidPassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage page=new LoginPage(driver);
		page.enterUsernameOnUsernameField(usernameValue);
		page.enterPasswordOnPasswordField(passwordValue);
		page.clickOnLoginButton();
	}
	@Test
	public void verifyUserWithInvalidUsernameAndValidPassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage page=new LoginPage(driver);
		page.enterUsernameOnUsernameField(usernameValue);
		page.enterPasswordOnPasswordField(passwordValue);
		page.clickOnLoginButton();
	}
	@Test
	public void verifyUserWithInvalidCredentials() throws IOException {
		String usernameValue=ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage page=new LoginPage(driver);
		page.enterUsernameOnUsernameField(usernameValue);
		page.enterPasswordOnPasswordField(passwordValue);
		page.clickOnLoginButton();
	}
}
