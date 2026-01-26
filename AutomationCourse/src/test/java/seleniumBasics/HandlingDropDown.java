package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	
	public void verifyDropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown);
		//select.selectByIndex(1);
		//select.selectByValue("testng");
		select.selectByVisibleText("SQL");
		
		
		/*WebElement firstDrpDn=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(firstDrpDn);
		select.selectByIndex(1);
		
		WebElement secondDrpDn=driver.findElement(By.id("dropdowm-menu-2"));
		select=new Select(secondDrpDn);
		select.selectByValue("testng");
		
		WebElement thirdDrpDn=driver.findElement(By.id("dropdowm-menu-3"));
		select=new Select(thirdDrpDn);
		select.selectByVisibleText("JQuery");*/
		
	}
	
	public void verifyCheckBox() {
	//	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement check=driver.findElement(By.xpath("//input[@value='option-1']"));
		check.click();
		
	}
	
	public void verifyRadioButton() {
	//	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement radioBtn=driver.findElement(By.xpath("//input[@value='green']"));
		radioBtn.click();
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropDown HandlingDrDn=new HandlingDropDown();
		HandlingDrDn.browserLaunch();
		HandlingDrDn.verifyDropDown();
		HandlingDrDn.verifyCheckBox();
		HandlingDrDn.verifyRadioButton();
	}

}
