package homeAssignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
   public static void main(String[] args) {
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://leafground.com/checkbox.xhtml");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(5));
	   driver.findElement(By.xpath("//span[text()='Basic']")).click();
	   driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	   driver.findElement(By.xpath("//label[text()='Java']")).click();
	   driver.findElement(By.xpath("//label[text()='Others']")).click();
	   driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]")).click();
	   driver.findElement(By.xpath("(//div[contains(@class,'ui-toggleswitch')])[1]")).click();
	   driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox')])[3]")).click();
	   driver.findElement(By.xpath("//ul[contains(@class,'selectcheckboxmenu-multiple')]")).click();
	   driver.findElement(By.xpath("(//label[contains(text(),'Miami')])[2]")).click();
	   driver.findElement(By.xpath("(//label[contains(text(),'Rome')])[2]")).click();
	   driver.findElement(By.xpath("(//label[contains(text(),'London')])[2]")).click();
	   driver.findElement(By.xpath("(//div[@class='card'])[7]")).click();
	   driver.close(); 
}
}
