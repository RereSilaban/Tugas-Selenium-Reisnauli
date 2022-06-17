package com.juaracoding.Web;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.Driver.DriverSingleton;


public class Fungsi {

	private WebDriver driver;

	public Fungsi() {	
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);	
	}
		
		//Locator
		@FindBy (css ="#email_create")
		private WebElement email;
		
		@FindBy (css ="#SubmitCreate > span")
		private WebElement btnCreate;
		
		@FindBy (id ="id_gender2")
		private WebElement title;
		
		@FindBy (id ="customer_firstname")
		private WebElement firtName;
		
		@FindBy (id ="customer_lastname")
		private WebElement lastName;
		
		@FindBy (id ="passwd")
		private WebElement password;

		@FindBy (xpath = "//*[@id=\"days\"]")
		private WebElement dateBirthday;
		
		@FindBy (id = "months")
		private WebElement monthsBirthday;
		
		@FindBy (id = "years")
		private WebElement yearssBirthday;
		
		@FindBy (id = "newsletter")
		private WebElement checkBox;

		@FindBy (id = "company")
		private WebElement company;

		@FindBy (id = "address1")
		private WebElement address;
		
		@FindBy (id="address2")
		private WebElement address2;
		
		@FindBy (id ="city")
		private WebElement city;
		
		@FindBy (xpath = "//*[@id=\"id_state\"]")
		private WebElement state;
		
		@FindBy (id="postcode")
		private WebElement postCode;
		
		@FindBy (xpath = "//*[@id=\"id_country\"]")
		private WebElement country;
		
		@FindBy (id="other")
		private WebElement information;
		
		@FindBy (id= "phone")
		private WebElement tlpHome;
		
		@FindBy (id= "phone_mobile")
		private WebElement hp;
		
		@FindBy (id= "alias")
		private WebElement reference;
		
		@FindBy (xpath = "//*[@id=\"submitAccount\"]")
		private WebElement btnReg;
		
		@FindBy (css = "#header > div.nav > div > div > nav > div:nth-child(2) > a")
		private WebElement btnLogout;
		
		@FindBy (id= "email")
		private WebElement loginEmail;
		
		@FindBy (id="passwd")
		private WebElement loginPassword;
		
		@FindBy (id="SubmitLogin")
		private WebElement btnLogin;
		
	
	//soal 1 register
	public void createAnAccount ()  {
	
		email.sendKeys("reresilaban@gmail.com");
		
		btnCreate.click();
		title.click();
		firtName.sendKeys("Rere");
		lastName.sendKeys("silaban");
		password.sendKeys("akucantik");
		
		//Date Of Birtday
		dateBirthday.click();
		dateBirthday.sendKeys("12");
		monthsBirthday.sendKeys("february");
		yearssBirthday.sendKeys("1997");
		
		checkBox.click();
		company.sendKeys("Juara Coding");
		address.sendKeys("Jakarta");
		address2.sendKeys("Bali");
		city.sendKeys("Bandung");
		state.sendKeys("idaho");
		postCode.sendKeys("10000");
		country.click();
		information.sendKeys("jangan pantang menyerah, ayok semangat kurus dan kaya");
		tlpHome.sendKeys("0223344");
		hp.sendKeys("089605");
		reference.clear();
		reference.sendKeys("rahasia");
		btnReg.click();
		btnLogout.click();
		
	}
	
	//soal 2 login
	public void login () {
		loginEmail.sendKeys("reresilaban@gmail.com");
		loginPassword.sendKeys("akucantik");
		btnLogin.click();
	}

}
