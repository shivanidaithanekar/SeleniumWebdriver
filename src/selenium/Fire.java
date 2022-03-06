package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fire {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	}

}
