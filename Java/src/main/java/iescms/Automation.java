package iescms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://test.upexciseonline.co/");
		driver.manage().window().maximize();
		driver.wait(3000);
	    
		
		

	}

}
