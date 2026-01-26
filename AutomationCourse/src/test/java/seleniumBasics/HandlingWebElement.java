package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElement extends Base{

	public void verifyWebElement() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		//WebElement msgBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement msgBox=driver.findElement(By.id("single-input-field"));
		msgBox.sendKeys("Hi Rose");
		
		//WebElement clickBtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement clickBtn=driver.findElement(By.id("button-one"));
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
