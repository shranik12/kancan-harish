package rupali;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class amazon {
	
 @Test
public void login() {
	 System.setProperty("webdriver.ie.driver", "C:\\Users\\shran\\Desktop\\Selenium softwares\\IEDriverServer.exe");
	 WebDriver driver = new InternetExplorerDriver() ;
	  driver.get("http://www.google.com/");
  }
/*@BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }
*/
}
