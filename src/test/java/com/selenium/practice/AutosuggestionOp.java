package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestionOp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/?utm_campaign=740105751&utm_source=google&utm_medium=cpc&utm_term=e_book%20domestic%20flights%20india&adgroupid=128245918074&device=c&gad_source=1&gclid=Cj0KCQiAhomtBhDgARIsABcaYym-t9ALsqKNO3O23Sx4cgaRFD9rOY5KXIC-q2FC1jBURcBFsjv54BYaAmh0EALw_wcB");
		driver.manage().window().maximize();
		WebElement bookFromfd = driver.findElement(By.xpath("//input[@id='FromSector_show']"));
		bookFromfd.click();
		Thread.sleep(3000);
		List<WebElement> listOfSuggestions = driver.findElements(By.xpath("//ul[@class='ausuggest']/li"));
		
		for (WebElement webElement : listOfSuggestions) {
			System.out.println(webElement.getText().trim());
			if(webElement.getText().trim().contains("Bangalore(BLR)")) {
				webElement.click();
				break;
			}
		}
		System.out.println("Test PASS!");
		Thread.sleep(3000);
		driver.close();
	}

}
