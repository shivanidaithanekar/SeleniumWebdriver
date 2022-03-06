package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMethod extends TestBrowserLaunches
{
	public static void main(String[] args)throws InterruptedException{
		System.setProperty(key1, path1);
		d = new ChromeDriver();
		//d.navigate().to(url1);
		//Thread.sleep(2000);
		//d.navigate().to(url2);
		//Thread.sleep(2000);
		//Thread.sleep(3000);
		//d.navigate().back();
		//Thread.sleep(3000);
		//d.navigate().forward();
		//Thread.sleep(2000);
		//d.navigate().refresh();
		////Thread.sleep(2000);
		//d.close();
		
		
		d.get(url1);
		d.get(url2);
		
		d.get("http://paytm.com/recharge");
	}

}
