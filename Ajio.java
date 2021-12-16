package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.ajio.com/");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1000);
		cd.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		//cd.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(1000);
		cd.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		String totalItems=cd.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(totalItems);
		System.out.println("Brand Names:");
		List<WebElement> brandNames=cd.findElements(By.className("brand"));
		for (WebElement webElement : brandNames) {
			
			String s=webElement.getText();
			System.out.println(s);
			
		}
		
		System.out.println("Bag Names:");
		List<WebElement> bagNames=cd.findElements(By.className("nameCls"));
		for (WebElement webElement1 : bagNames) {
			String bnames=webElement1.getText();
			System.out.println(bnames);
			
		}
		
		
	}

}
