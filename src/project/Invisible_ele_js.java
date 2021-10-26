package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Invisible_ele_js
{

	public static void main(String[] args) 
	{
		// open browser
		System.setProperty("webdriver.chrome.driver", "D:\\Gk\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		WebDriverWait w = new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='File']")));
		//Collect invisible items of a drop-down
		List<WebElement>l=driver.findElements(By.xpath("(//*[@class='ui dropdown'])[1]/div[2]/div"));
		System.out.println("Items in the list are: "+l.size());
		for (WebElement e:l)
		{
			List<WebElement>cl=e.findElements(By.xpath("(child::span)|(child::i)"));
			if(cl.size()==0)
			{
				driver.executeScript("var v=arguments[0].textContent;window.alert(v);",e);
				
				String x=driver.switchTo().alert().getText();
				driver.switchTo().alert().dismiss();
				System.out.println(x);
			}
			else
			{
				String x=(String) driver.executeScript("return arguments[0].textContent;",cl.get(0));
				System.out.println(x);
			}
		}

	}

}
