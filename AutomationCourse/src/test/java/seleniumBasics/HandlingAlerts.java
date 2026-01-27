package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement alertBtn=driver.findElement(By.id("alertButton"));
		alertBtn.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();	
	}
	
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement confirmBtn=driver.findElement(By.id("confirmButton"));
		confirmBtn.click();
		Alert alert=driver.switchTo().alert();
		//alert.accept();	
		alert.dismiss();		
	}
	
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		
		WebElement promptBtn=driver.findElement(By.id("promtButton"));
		promptBtn.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Rose");
		alert.accept();	
		//alert.dismiss();
		
	}
	public static void main(String[] args) {
		HandlingAlerts alert=new HandlingAlerts();
		alert.browserLaunch();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();	
	}
}
