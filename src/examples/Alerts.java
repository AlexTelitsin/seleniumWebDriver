package examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CHrome
		//System.setProperty("webdriver.chrome.driver", "C:\\Develop\\Drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();

		//FireFox
		System.setProperty("webdriver.gecko.driver", "C:\\Develop\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
				
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.switchTo().alert().accept(); //Accept = ok done yes
	}

}