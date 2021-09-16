import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{

	public static void main(String[] args)
	{
		// configure the webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\NIKITA\\workspace\\Selenium\\driver\\chromedriver.exe");
		
		//launch browser
		WebDriver driver = new ChromeDriver();
		
		
		//to navigate the url
		driver.get("https://www.facebook.com/");
		
		
		//to print title
		String title =driver.getTitle();
		System.out.println(title);
	
		//to print current page url
		String cu = driver.getCurrentUrl();
		System.out.println(cu);
		
		//to close close() or quite()
		driver.close();
	
		

	}

}
