package rupali;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\shran\\Desktop\\Selenium softwares\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com/");
/*
	String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().to("http://yahoo.com");
        
		String title2=driver.getTitle();
		System.out.println(title2);
	*/	

		driver.get("http://www.google.com/");
		
		WebElement element=driver.findElement(By.id("lst-ib"));
		element.sendKeys("viraj");
		
		driver.get("http://www.google.com/");
		
		Boolean Displaystatus=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(Displaystatus); 
		
		Boolean Isenabled=driver.findElement(By.linkText("Gmail")).isEnabled();
		System.out.println(Isenabled);
		
		
		/*
		driver.get("http://www.gcrit.com/build3/login.php");
		
		Boolean Displaystatus=driver.findElement(By.className("ui-button-text")).isDisplayed();
		System.out.println(Displaystatus); 
		
		Boolean Isenabled=driver.findElement(By.className("ui-button-text")).isEnabled();
		System.out.println(Isenabled);
		
		driver.findElement(By.className("ui-button-text")).click();
		*/
		
		
		
		
		
		
		
		driver.close();
		
	
	}
}

