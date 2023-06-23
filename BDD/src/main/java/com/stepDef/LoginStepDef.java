package com.stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	WebDriver driver;

	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Selenium/Selenium%20Softwares/Offline%20Website/index.html");

	}

	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
	}

	@When("^user clicks on button$")
	public void user_clicks_on_button() throws Throwable {

		driver.findElement(By.xpath("//button")).click();
	}

	@Then("^user will be on dashboard page$")
	public void user_will_be_on_dashboard_page() throws Throwable {

		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}
}
