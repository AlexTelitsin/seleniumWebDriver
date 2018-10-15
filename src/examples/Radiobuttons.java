package examples;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CHrome
		System.setProperty("webdriver.chrome.driver", "C:\\Develop\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//FireFox
		//System.setProperty("webdriver.gecko.driver", "/Users/alextelitsin/Develop/allDrivers/geckodriver");
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");

		
		driver.get("http://echoecho.com/htmlforms10.htm"); //Hit url on the browser

		driver.findElement(By.xpath("//input[@value='Milk']")).click();

		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for (int i=0;i<count;i++) {
			
		//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
		String text =driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			
		if(text.equals("Cheese")) {
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		}

	}

}

