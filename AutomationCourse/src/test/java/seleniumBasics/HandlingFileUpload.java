package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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
	
	public void verifyFileUploadUsingRobots() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdfFile=driver.findElement(By.id("pickfiles"));
		selectPdfFile.click();
		StringSelection selection=new StringSelection("C:\\Users\\HOME\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Doc1 - Copy.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		Robot r=new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload fileupld=new HandlingFileUpload();
		fileupld.browserLaunch();
		//fileupld.verifyFileUploadUsingSendKeys();
		try {
			fileupld.verifyFileUploadUsingRobots();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
