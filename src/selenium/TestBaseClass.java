package selenium;

public interface TestBaseClass {


		String key1 = "webdriver.chrome.driver";
		String key2 = "webdriver.gecko.driver";
		String path1 = "C:\\Users\\daith\\Downloads\\chromedriver_win32\\chromedriver.exe";
		String path2 = "C:\\Users\\daith\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe";
		String url1 = "https://www.facebook.com/signup";
		String url2 = "https://www.amazon.in/";
		public void chromeLaunch();
		public void firefoxLaunch();
		default void welcomeSelenium() {
			System.out.println("**Welcome in Seleniun World**");
			automation();
		}
		private void automation() {
			System.out.println("--Start Automation Testing Using Selenium WebDriver--");
		}
	}

