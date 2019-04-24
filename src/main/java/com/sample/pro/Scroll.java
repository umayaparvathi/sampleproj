package com.sample.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\MavenSample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		WebElement s = driver.findElement(By.xpath("//a[text()='Subscribe in a reader']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", s);
		Thread.sleep(2000);
		WebElement btnup = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		js.executeScript("arguments[0].scrollIntoView(false)", btnup);

	}
}
