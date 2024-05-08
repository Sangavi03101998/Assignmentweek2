package homeAssignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
 public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Sangavi");
	driver.findElement(By.name("lastname")).sendKeys("Sekar");
	driver.findElement(By.name("reg_email__")).sendKeys("Sekar03@gmail.com");
	//driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Sekar03@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Tester");
	WebElement dateDD=driver.findElement(By.name("birthday_day"));
	Select sel=new Select(dateDD);
	sel. selectByIndex(2);
	WebElement monthDD=driver.findElement(By.name("birthday_month"));
	Select selMonth=new Select(monthDD);
	selMonth. selectByValue("10");
	WebElement yearDD=driver.findElement(By.name("birthday_year"));
	Select selYear=new Select(yearDD);
	selYear. selectByIndex(26);
	driver.findElement(By.name("sex")).click();
	driver.findElement(By.name("websubmit")).click();
	driver.close();
}
}
