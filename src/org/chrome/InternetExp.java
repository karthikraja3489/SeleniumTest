package org.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\Hp\\eclipse-workspace\\SeleniumTest\\Driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/login/");
	}

}
