package com.sample.pro;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SeliniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot gh = (TakesScreenshot) driver;
		File s = gh.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File d = new File("F:\\umascreenshot//.png");
		FileUtils.copyFile(s, d);
	}
		
	}


