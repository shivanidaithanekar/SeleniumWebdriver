package selenium_Xpath_Amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch implements LinksAndPaths {
	
	public void amazonLaunch() throws InterruptedException {
		System.setProperty(chrome_key, chromedriver_path);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();

		d.get(amazon_url);
		Thread.sleep(3000);
		d.navigate().to("d.navigate().to(\"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\"\r\n"
				+ "");
		   d.findElements(By.xpath("//input[@id='ap_email']")).Sendkeys("daithanekarshivani@gmail.com");
		Thread.sleep(3000);
		d.navigate().to("d.navigate().to(https://www.amazon.in/b?node=5210079031&pf_rd_r=H5CFZAQGDQS8D5KHXF0E&pf_rd_p=94f4870f-75f6-44ea-9dbd-22b1bd210c44&pd_rd_r=e393c292-a949-4f4f-9534-13981c6af861&pd_rd_w=Yofv7&pd_rd_wg=i4CNE&ref_=pd_gw_unk)");
		   d.findElements(By.xpath("//input[@id='continue']")).click();
	 d.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("shiva123");
	 d.findElement(By.xpath("//input[@id='signInsubmit']")).click();
	 d.close();

		
	
	}

}
