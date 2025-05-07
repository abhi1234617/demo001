package demo001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver-win64 (3)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		driver.findElement(By.name("userName")).sendKeys("Cirrus");
		Thre is a house.
		
		
	}

}
