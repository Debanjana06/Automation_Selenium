package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFunc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select options = new Select(dropdown);
		options.selectByIndex(1);
		Thread.sleep(2000);
		options.selectByValue("option2");
		Thread.sleep(2000);
		options.selectByVisibleText("Option3");
//		List<WebElement> ele = options.getOptions();
//		for(int i =0; i<ele.size();i++) {
//			ele.get(i).click();
//			Thread.sleep(2000);
//			System.out.println(ele.get(i).getText());
//		}
		Thread.sleep(3000);
		driver.close();
		
	}

}
