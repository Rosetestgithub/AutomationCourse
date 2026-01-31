package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	public void verifyFileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\HOME\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Doc1 - Copy.pdf");
		WebElement checkBx=driver.findElement(By.id("terms"));
		checkBx.click();
		WebElement submitBtn=driver.findElement(By.id("submitbutton"));
		submitBtn.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload fileupld=new HandlingFileUpload();
		fileupld.browserLaunch();
		fileupld.verifyFileUploadUsingSendKeys();
	}

}
