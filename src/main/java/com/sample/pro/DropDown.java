package com.sample.pro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeliniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		/*List<WebElement> emp = s.getOptions();
		    for (int i = 0; i < emp.size(); i++) {
			WebElement w = emp.get(i);
			String name = w.getText();
			System.out.println(name);
		}
		for (WebElement v:emp) {
		String name1 = v.getAttribute("value");
		System.out.println(name1);
		}*/
		
		s.selectByIndex(7);
		s.selectByValue("7");
		s.selectByVisibleText("Jul");
	}
}
