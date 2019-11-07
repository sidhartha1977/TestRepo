import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create Driver object for new chrome Browser
		//strictly implement method of webdriver
		
		/* Class name = ChromeDriver
		    X driver = new X();*/		
		
		//invoke.exe file 1st
		//for Chrome Driver		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sidh2\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk");
		System.out.println(driver.getTitle());
		
		//For IE Driver
		
	/*	System.setProperty("webdriver.ie.driver","Path");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.co.uk");
		System.out.println(driver.getTitle());*/

	}

}
