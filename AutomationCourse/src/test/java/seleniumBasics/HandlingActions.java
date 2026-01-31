package seleniumBasics;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	
	public void verifyRightClick() {
		WebElement other=driver.findElement(By.id("others"));
		Actions a=new Actions(driver);
		a.contextClick(other).build().perform();	
	}
	
	public void verifyMouseOver() {
		WebElement other=driver.findElement(By.id("others"));
		Actions a=new Actions(driver);
		a.moveToElement(other).build().perform();
	}
	
	public void verifyDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
	}
	
	public void verifyKeyBoardAction() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions action=new HandlingActions();
		action.browserLaunch();
		//action.verifyRightClick();
		//action.verifyMouseOver();
		//action.verifyDragAndDrop();
		try {
			action.verifyKeyBoardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
