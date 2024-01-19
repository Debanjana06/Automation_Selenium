package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://testsigma.com/");
	        driver.manage().window().maximize();
	        WebElement element = driver.findElement(By.xpath("//a[text()='Resources']"));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).build().perform();
	        ////a[text()='Product']
	        WebElement element1 = driver.findElement(By.xpath("//a[text()='Product']"));
	        Thread.sleep(3000);
	        actions.clickAndHold(element1).build().perform();
	      WebElement ele =  driver.findElement(By.xpath("//a[text()='Docs']"));   
	       
	        Thread.sleep(3000);
	        actions.doubleClick(ele).build().perform();
	        
	}

}
