package com.juaracoding.Main;

import org.openqa.selenium.WebDriver;

import com.google.common.annotations.VisibleForTesting;
import com.juaracoding.Driver.DriverSingleton;
import com.juaracoding.Web.Fungsi;


public class MainWeb {

	public static void main(String[] args) {
	
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Fungsi fungsi = new Fungsi ();
	// soal 1.Register
		fungsi.createAnAccount();
		
	// soal 2.Login
		fungsi.login();
	}

}