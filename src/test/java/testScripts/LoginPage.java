package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		//System.out.println("New branch created");
		WebElement salary = driver.findElement(By.xpath("//td[contains(text(),'B. Greer')]//following-sibling::td[5]"));
		System.out.println(salary.getText());
		List <WebElement> items= driver.findElements(By.xpath("//td[contains(text(),'B. Greer')]//following-sibling::td"));
		System.out.println("Size :"+ items.size());
		System.out.println("Details of Greer");
		for (WebElement cell:items)
			
			System.out.println(cell.getText());
		List <WebElement> namelist = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//preceding-sibling::td[2]"));
		System.out.println("Name list - San Francisco");
		for (WebElement cell2:namelist)
			System.out.println(cell2.getText());
		driver.close();
		

	}

}
