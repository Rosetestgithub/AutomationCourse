package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNGBasics.TestNGBase;

public class LoginTest extends TestNGBase {
	@Test
	public void verifyUserWithValidCredentials() {
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginBtn=driver.findElement(By.id("login-button"));
		loginBtn.click();
	}
	@Test
	public void verifyUserWithValidUsernameAndInvalidPassword() {
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("problem_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("qwerty");
		WebElement loginBtn=driver.findElement(By.id("login-button"));
		loginBtn.click();
	}
	@Test
	public void verifyUserWithInvalidUsernameAndValidPassword() {
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginBtn=driver.findElement(By.id("login-button"));
		loginBtn.click();
	}
	@Test
	public void verifyUserWithInvalidCredentials() {
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("abcd");
		WebElement loginBtn=driver.findElement(By.id("login-button"));
		loginBtn.click();
	}
}
