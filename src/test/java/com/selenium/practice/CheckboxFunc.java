package com.selenium.practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxFunc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
//		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
//		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
//		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
//		
//		checkbox1.click();
//		System.out.println(checkbox1.isSelected());
//		System.out.println(checkbox1.isDisplayed());
//		System.out.println(checkbox1.isEnabled());
//		
//		Thread.sleep(2000);
//		checkbox2.click();
//		System.out.println(checkbox2.isSelected());
//		System.out.println(checkbox2.isDisplayed());
//		System.out.println(checkbox2.isEnabled());
//		
//		Thread.sleep(2000);
//		checkbox3.click();
//		System.out.println(checkbox3.isSelected());
//		System.out.println(checkbox3.isDisplayed());
//		System.out.println(checkbox3.isEnabled());
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i = 0; i<checkbox.size();i++) {
			checkbox.get(i).click();
			System.out.println(checkbox.get(i).isSelected());
			System.out.println(checkbox.get(i).isDisplayed());
			System.out.println(checkbox.get(i).isEnabled());
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
