package project;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pseudo_ele 
{

	public static void main(String[] args)
	{
		//open bowser
		System.setProperty("webdriver.chrome.driver", "D:\\Gk\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Launch site
		driver.get("https://www.goindigo.in");
		

	}

}
