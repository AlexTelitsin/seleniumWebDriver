package examples;

import org.openqa.selenium.WebDriverException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code-
				
				//create Driver object from Chrome Browser
				System.setProperty("webdriver.chrome.driver", "/Users/alextelitsin/Develop/allDrivers/chromedriver");
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.google.com/"); //Hit url on the browser
				System.out.println(driver.getTitle()); //Validate if your Page title is correct
				System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct url
				// System.out.println(driver.getPageSource()); //Print Page source
				driver.get("http://yahoo.com");
				//driver.navigate().back(); //возвращает на предидущую страницу
				//driver.navigate().forward(); //возвращает на следующую страницу
				driver.close(); //It closes browser
				//driver.quit(); //It closes all the opened by selenium script

				
	}

}
