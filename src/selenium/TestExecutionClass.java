package selenium;

public class TestExecutionClass extends TestBrowserLaunches 
{
	public static void main(String[] args) {
		TestExecutionClass t = new TestExecutionClass();
		t.welcomeSelenium();
		t.chromeLaunch();
		d.manage().window().maximize();
		d.close();
		t.welcomeSelenium();
		t.firefoxLaunch();
		d.close();
	}

}
