package selenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BasicLocaters1 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver d = new ChromeDriver();	
			d.manage().window().maximize();
			Thread.sleep(3000);
			d.get("file://C:/Users/daith/OneDrive/Desktop/selenium_s.html");
			d.findElement(By.tagName("input")).sendKeys("shivani");
			d.findElement(By.name("pwd")).sendKeys("my name is shiv");
			d.findElement(By.id("rd148")).click();
		}

	}

