package examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/alextelitsin/Develop/allDrivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://spicejet.com/"); //Hit url on the browser
		Select s=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("AED");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//s.selectByIndex(""); //Using selectByIndex( ) command to select any list option using its Index value from the Multi Select Box field. (command is used to select the list option using the specified Index of the List Option from the multi-selection Box field.)
		s.selectByVisibleText("USD");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='DXB'][contains(text(),'Dubai (DXB)')]")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr[2]//td[3]//a[1]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		//driver.close();
		
	}

}
