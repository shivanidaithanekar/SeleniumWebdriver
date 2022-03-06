package selenium;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AdvanceLocators {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver d = new ChromeDriver();	
			d.manage().window().maximize();
			Thread.sleep(3000);
			d.get("file:///C:/Users/daith/OneDrive/Desktop/webPage.html");
			// 1. Absolute Xpath Normal/Regular -- // Tagname/Tagname/Tagname
			d.findElement(By.xpath("html/body/div2/input")).sendKeys("Study Hard and Focus More");
			// 2. Absolute Xpath by Index
			// Tagname/Tagname[Index]
			d.findElement(By.xpath("html/body/div2/input[2]")).sendKeys("1234567890");
		}
	}

