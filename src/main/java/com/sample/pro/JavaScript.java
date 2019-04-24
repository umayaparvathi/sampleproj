package com.sample.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeliniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement s = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		// typecast
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','Hello')", s);
		js.executeScript("arguments[0].setAttribute('value','Greenstech')", pass);
		String name = (String) js.executeScript("return arguments[0].getAttribute('value')", s);
		String password = (String) js.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(name);
		System.out.println(password);
		WebElement btnlogin = driver.findElement(By.id("u_0_3"));
		js.executeScript("arguments[0].click()", btnlogin);

	}

}
