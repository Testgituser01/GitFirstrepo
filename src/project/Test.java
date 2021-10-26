package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gk\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		cd.manage().window().maximize();
		cd.switchTo().frame("iframeResult");
		cd.findElements(By.xpath("//select/option"));
          List cars = cd.findElements(By.xpath("//select/option"));
        System.out.print(cars);
		Select s =new Select((WebElement) cars);
		s.selectByVisibleText("volvo");
		
		
		
	}
}
