package demojenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class DemoJenkinsJobs {
	
	@Test
	public void testJenkins() {
		System.out.println("Welcome to Jenkins World");
		//System.setProperty("webdriver.gecko.driver", "D:\\Browser\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.opera.driver", "D:\\Browser\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		//WebDriver driver=new OperaDriver();	
		//System.setProperty("webdriver.ie.driver", "D:\\Browser\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}
