package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class TestBrowserLaunches implements TestBaseClass
{
	static WebDriver d;
	public void chromeLaunch() {
		System.setProperty(key1,path1);
		d = new ChromeDriver();
		d.get(url1);
	}
	public void firefoxLaunch() {
		System.setProperty(key2, path2);
		d = new FirefoxDriver();
		d.get(url1);
	}

}
