package seleniumBasics;

import org.openqa.selenium.By;

public class Locator extends Base{
	
	public void verifyLocator() {
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple"));
		driver.findElement(By.cssSelector("button[id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']"));		//id
		driver.findElement(By.xpath("//button[text()='Show Message']"));	//text()
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']")); //and
		driver.findElement(By.xpath("//button[@id='button-one' or  @type='superbutton']")); //or
		
		
		//when xpath is not worked with id, text(), and  and or then we use access method ie, parent, child etc.
		//1. parent
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')] //parent::div[@class='card']"));
	
		//2. child
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		
		//3. following
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		
		//4. preceding
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		
		//5. ancestor
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		
		//6. descendant
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		
                                                                    	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locator locator=new Locator();
		locator.browserLaunch();
		//locator.verifyLocator();
		
		
	}

}
