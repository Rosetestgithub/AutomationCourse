package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWebElement extends Base{

	public void verifyWebElement() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		//WebElement msgBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement msgBox=driver.findElement(By.id("single-input-field"));
		msgBox.sendKeys("Hi Rose");
		
		//WebElement clickBtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement clickBtn=driver.findElement(By.id("button-one"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(clickBtn));
		Wait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(clickBtn));
		clickBtn.click();	
		
		WebElement textMsg=driver.findElement(By.id("message-one"));
		System.out.println(textMsg.getText());
		msgBox.clear();
		System.out.println(textMsg.getTagName());
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingWebElement handlingWebE=new HandlingWebElement();
		handlingWebE.browserLaunch();
		handlingWebE.verifyWebElement();
	}

}
