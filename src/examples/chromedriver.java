
package examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/alextelitsin/Develop/allDrivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //Hit url on the browser
		driver.findElement(By.id("email")).sendKeys("text"); //после By. выбираем тип элемента который ищем на странице
		driver.findElement(By.id("pass")).sendKeys("text"); 
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='fsl fwb fcb']")).getText());
		driver.quit();
		
		
		 
	}

}
