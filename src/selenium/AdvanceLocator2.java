package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceLocator2 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\daith\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver d = new ChromeDriver();	
			d.manage().window().maximize();
			Thread.sleep(3000);
			d.get("file:///C:/Users/daith/OneDrive/Desktop/webPage.html");
			// 1. Relative Xpath Normal/Regular -- 
			// Std. Syntax = //Tagname
			d.findElement(By.xpath("//input")).sendKeys("Bosss");
			// 2. Relative Xpath by Index -- 
			// Std. Syntax = //Tagname[index]
			d.findElement(By.xpath("//input[2]")).sendKeys("James007");
			// Std. Syntax = //Tagname/tagname[index]
			d.findElement(By.xpath("//div[2]/input[2]")).sendKeys("1478523699");
			d.findElement(By.xpath("//div[3]/input[2]")).click();
			// Std. Syntax = (XPATH)[Index] - for whole page
			d.findElement(By.xpath("(//div/input)[7]")).click();
			// 3. Relative Xpath by Attribute -- 
			// Std. Syntax = //Tagname[@AttributeName='AttributeValue']
			d.findElement(By.xpath("//input[@type='button']")).click();
			d.navigate().back();
			// 4. Relative Xpath by Text Function -- Link 
			// Std. Syntax = //Tagname[text()='TextValue']
			d.findElement(By.xpath("//a[text()='Forgotton Password?']")).click();
			// 5. Relative Xpath by Contains --  
			// a) Relative Xpath by Contains -- using Attribute
			// Std. Syntax = //Tagname[contains(@AttributeName,'AttributeValue')]
			// b) Relative Xpath by Contains -- using Text Function
			// Std. Syntax = //Tagname[contains(text(),'textValue')]
			Thread.sleep(3000);
			d.navigate().back();
			d.findElement(By.xpath("//input[contains(@value,'Submit')]")).click();
		}
	}


