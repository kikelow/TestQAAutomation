package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class StepDefinitions {

	WebDriver driver;
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		
	System.out.println("Start writing your tests here");
	}

}
