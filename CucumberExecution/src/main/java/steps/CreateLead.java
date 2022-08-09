package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	
	
	@Given("Enter the username as {string}")
	public void userName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		
	}
	@Given("Enter the password as {string}")
	public void password(String Password)
	{
		driver.findElement(By.id("password")).sendKeys(Password);
	}
	
	@When("Click on login button")
	public void loginButton() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
	   
	}
	@Then("homepage should be displayed")
	public void homePage_display()
	{
      boolean displayed = driver.findElement(By.partialLinkText("CRM/SFA")).isDisplayed();
      if(displayed)
      {
    	  System.out.println("home page displayed successfully");
    	  
      }else
      {
    	  System.out.println("home page is not displayed");
      }
	
	}
	@When("click on {string} link")
	public void clickHyperLink(String linkedText){
		driver.findElement(By.linkText(linkedText)).click();
		 
	 }
	@Then("{string} page should be displayed")
	public void verifyPage(String pageName)
	{
		boolean pageDisplayed = driver.findElement(By.xpath("//div[text()='"+pageName+"']")).isDisplayed();
		if(pageDisplayed)
		{
			System.out.println(pageName+" is Displayed");
		}
		else
		{
			System.out.println(pageName+"is not displayed");
		}
	}
	@Given("Enter the CompanyName as {string}")
	public void companyName(String CompanyName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
	}
	@Given("Enter the FirstName as {string}")
	public void firstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@Given("Enter the LastName as {string}")
	public void lastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	@Given("Enter the Mobile Number as {string}")
	public void MobileNumber(String MobileNum) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(MobileNum);
	}
	@When("click on Create Lead button")
	public void clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	
	
	
}
	




//
