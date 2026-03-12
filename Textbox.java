package seleniumBasicCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Textbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Cpath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		String text = driver.getTitle();
			System.out.println(text);
			
		/*	Thread.sleep(2000);
			
			driver.findElement(By.id("j_idt88:name")).sendKeys("Mohan ");
			WebElement TypeYourName = driver.findElement(By.id("j_idt88:name"));
			TypeYourName.sendKeys("Prabhu");
			
			WebElement appendCity=driver.findElement(By.id("j_idt88:j_idt91"));
			appendCity.sendKeys(" to Coimbatore");
			
			WebElement disableField=driver.findElement(By.id("j_idt88:j_idt93"));
			boolean disable=disableField.isEnabled();
			System.out.println(disable);
			
			WebElement clearField=driver.findElement(By.id("j_idt88:j_idt95"));
			clearField.clear();
			
			Thread.sleep(2000);
			
			WebElement retrieve=driver.findElement(By.id("j_idt88:j_idt97"));
			String attribute= retrieve.getAttribute("value");
			System.out.println(attribute);
			
			WebElement emailField=driver.findElement(By.id("j_idt88:j_idt99"));
			emailField.sendKeys("mohanprabhu2401@gmail.com");

			Thread.sleep(2000);
			
			emailField.sendKeys(Keys.TAB);
			
			WebElement yourselfField= driver.findElement(By.id("j_idt88:j_idt101"));
			yourselfField.sendKeys("I am Mohan Prabhu from Coimbatore");
			
			WebElement errorField=driver.findElement(By.id("j_idt106:thisform:age"));
			errorField.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
			
			WebElement labelpositionField=driver.findElement(By.id("j_idt106:float-input"));
			labelpositionField.click();
			
			Thread.sleep(2000);
			
			WebElement namedropdown=driver.findElement(By.id("j_idt106:auto-complete_input"));
			namedropdown.sendKeys("Prabhu");
			Thread.sleep(2000);
			driver.findElement(By.xpath ("//li[text()='2']")). click ();

			WebElement dob=driver.findElement(By.id("j_idt106:j_idt116_input"));
			dob.sendKeys("01/24/2000");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='24']")).click();
			
			WebElement spinField=driver.findElement(By.id("j_idt106:j_idt118_input"));
			spinField.sendKeys("24");
			spinField.sendKeys(Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='24']")).click(); 
			
			WebElement randomField=driver.findElement(By.id("j_idt106:slider"));
			randomField.sendKeys("24");
			randomField.sendKeys(Keys.TAB); 
			
			WebElement keyboardField=driver.findElement(By.id("j_idt106:j_idt122"));
			keyboardField.click();
			driver.findElement(By.xpath("//button[text()='m']")).click();
			driver.findElement(By.xpath("//button[text()='o']")).click();
			driver.findElement(By.xpath("//button[text()='h']")).click();
			driver.findElement(By.xpath("//button[text()='a']")).click();
			driver.findElement(By.xpath("//button[text()='n']")).click();
			keyboardField.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			keyboardField.sendKeys(Keys.TAB); 
			
		WebElement texteditor=driver.findElement(By.className("ql-editor"));
		texteditor.sendKeys("Hello Jarvis");
		
		Actions a = new Actions(driver);
		a.moveToElement(texteditor).click().doubleClick().build().perform();
		
		//Thread.sleep(1000);
		//driver.findElement(By.className("ql-font")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[@class='ql-picker-item'])[2]")).click();
	
		//driver.findElement(By.className("ql-size")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//span[@class='ql-picker-item'])[7]")).click();
	
		//driver.findElement(By.className("ql-formats")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.className("ql-bold")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.className("ql-italic")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.className("ql-color")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//span[@class='ql-picker-item ql-primary'])[6]")).click();
		//texteditor.sendKeys(Keys.ARROW_RIGHT); 
		
		driver.findElement(By.className("ql-background")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ql-picker-item ql-primary'])[10]")).click();
		texteditor.sendKeys(Keys.ARROW_RIGHT);
		
		driver.findElement(By.className("ql-header")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//button[@class='ql-header ql-active'])")).click();
		
		//driver.findElement(By.className("ql-blockquote")).click(); 
		
		//driver.findElement(By.xpath("(//button[@class='ql-code-block'])")).click();
		driver.findElement(By.xpath("(//button[@class='ql-list'])[1]")).click();  */
		
			WebElement customtool = driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]"));
			customtool.sendKeys("Hello Jarvis");	
			Thread.sleep(1000);
			
			Actions b = new Actions(driver);
			b.moveToElement(customtool).click().doubleClick().build().perform();
			
			driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
			driver.findElement(By.xpath("(//button[@class='ql-strike'])[2]")).click(); 
			driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[6]")).click();
			
			
	}
}

