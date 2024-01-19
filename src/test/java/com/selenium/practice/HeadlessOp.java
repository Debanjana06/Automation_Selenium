package com.selenium.practice;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessOp {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.browserstack.com/");
		System.out.println("Title is: " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		driver.quit();

	}

}
