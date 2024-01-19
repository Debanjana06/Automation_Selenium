package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioFunc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
//		WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
//		WebElement radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
//		WebElement radio3 = driver.findElement(By.xpath("//input[@value='radio3']"));
//		
//		radio1.click();
//		System.out.println( radio1.isSelected());
//		System.out.println( radio1.isDisplayed());
//		System.out.println( radio1.isEnabled());
//		
//		Thread.sleep(2000);
//		radio2.click();
//		System.out.println();
//		System.out.println( radio1.isSelected());
//		System.out.println( radio2.isSelected());
//		System.out.println( radio2.isDisplayed());
//		System.out.println( radio2.isEnabled());
//		
//		Thread.sleep(2000);
//		radio3.click();
//		System.out.println();
//		System.out.println( radio3.isSelected());
//		System.out.println( radio3.isDisplayed());
//		System.out.println( radio3.isEnabled());
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i = 0; i<radio.size();i++) {
			radio.get(i).click();
			System.out.println(radio.get(i).isSelected());
			System.out.println(radio.get(i).isDisplayed());
			System.out.println(radio.get(i).isEnabled());
			Thread.sleep(2000);
		}
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
