package com.sample.pro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeliniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice%20table/");
		driver.manage().window().maximize();
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRows.size(); i++) {
			WebElement eachRow = tRows.get(i);
			List<WebElement> tCol = eachRow.findElements(By.tagName("td"));
			for (int j = 0; j < tCol.size(); j++) {
				WebElement eachdata = tCol.get(j);
				String name = eachdata.getText();
				System.out.println(name);
			}
		}
	}
}
