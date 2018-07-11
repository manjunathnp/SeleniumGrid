package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest 
{

	public static void main(String[] args) throws MalformedURLException 
	{
		//1. Define Desired Capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//2. Chrome Options Definitions
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		//HUB location
		String hubURL = "http://192.168.0.2:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), options);
		
		driver.get("http://freecrm.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
		
	}

}
