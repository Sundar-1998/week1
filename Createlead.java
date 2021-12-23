package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.id("username")) .sendKeys ("DemoSalesManager");
		 driver.findElement(By.id("password")) .sendKeys ("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")) .click();
		 driver.findElement(By.linkText("CRM/SFA")) .click();
		 driver.findElement(By.linkText("Leads")) .click();
		 driver.findElement(By.linkText("Create Lead")) .click();
		 driver.findElement(By.id("createLeadForm_companyName")) .sendKeys("GAUS");
		 driver.findElement(By.id("createLeadForm_firstName")) .sendKeys("Sundar");
		 driver.findElement(By.id("createLeadForm_lastName")) .sendKeys("Ganesan");
		 driver.findElement(By.name("submitButton")) .click();
		 System.out.println("Title of the web page:" + title);
	
		 
		 
		 

	}

}
