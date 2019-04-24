package com.sample.pro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeliniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
	//	driver.switchTo().frame(1);
		driver.switchTo().frame("a077aa5e");
		WebElement btnImg = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		btnImg.click();
		driver.switchTo().parentFrame();
	//	driver.quit();
	}

}