package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Day2Selenium\\driver\\chromedriver.exe" );
	WebDriver fb=new ChromeDriver();
	fb.get("https://facebook.com/");
	WebElement s = fb.findElement(By.id("email"));
	s.sendKeys("Greens");
	WebElement s1 = fb.findElement(By.name("pass"));
	s1.sendKeys("12345678");
	
}
}
