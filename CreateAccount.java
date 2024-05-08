package homeAssignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	   public static void main(String[] args) {
 	   ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Tester03");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industryDD=driver.findElement(By.name("industryEnumId"));
		Select sel= new Select(industryDD);
		sel.selectByIndex(3);
		WebElement ownershipDD=driver.findElement(By.name("ownershipEnumId"));
		Select selOwnership= new Select(ownershipDD);
		selOwnership.selectByVisibleText("S-Corporation");
		WebElement EmployeeDD=driver.findElement(By.id("dataSourceId"));
		Select selEmployee= new Select(EmployeeDD);
		selEmployee.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaignDD=driver.findElement(By.id("marketingCampaignId"));
		Select selMarketing= new Select(marketingCampaignDD);
		selMarketing.selectByIndex(6);
		WebElement ProvinceDD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select selProvince= new Select(ProvinceDD);
		selProvince.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}
}
