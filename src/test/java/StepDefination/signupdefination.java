package StepDefination;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import hooks.Hookclass;
import hooks.Hooksclass;



public class signupdefination {
	WebDriver driver = Hooksclass.driver;
	
	
	@Given("User is on the elearning application page")
	public void user_is_on_the_elearning_application_page() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		String title = driver.getTitle();
		System.out.println(title);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to get the title of E-Learning website "+e);
		}
	   
	}

	@When("User enters the login credentials like username and password.")
	public void user_enters_the_login_credentials_like_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			driver.manage().window().maximize();
			driver.findElement(By.id("login")).sendKeys("admin1234321");
			driver.findElement(By.id("password")).sendKeys("pass123");
		}
		catch(Exception e)
		{
			System.out.println("Not Able to enter the login details"+e);
		}
	    
	}

	@Then("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			driver.findElement(By.id("form-login_submitAuth")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on login button"+e);
		}
		
	   
	}
	@Then("User is navigated to the welcome page")
	public void user_is_navigated_to_the_welcome_page() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(3000);
			String expectedtitle = "My Organization - My education - My courses";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate to the welcome page");
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to navigate to the welcome page"+e);
			Assert.fail();
		}
	}
	@When("User Click on personal agenda option")
	public void user_Click_on_personal_agenda_option() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			driver.findElement(By.xpath("//a[@title='Personal agenda']")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on personal agenda"+e);
		}
	}

	@Then("User navigates the personal agenda option.")
	public void user_navigates_the_personal_agenda_option() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(3000);
			String expectedtitle = "My Organization - My education - Agenda";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate to the personal agenda option");
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to navigate to the personal agenda page"+e);
			Assert.fail();
		}
	}
	@Then("User clicks on Calendar option")
	public void user_clicks_on_Calendar_option() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			driver.findElement(By.xpath("//*[@id='toolbar-agenda']/div/div[1]/a[1]/img")).click();
			System.out.println("Click on calendar function is working fine ");
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on personal agenda"+e);
		}
	   
	}

	@Then("User navigates the calendar option.")
	public void user_navigates_the_calendar_option() {
		try
		{
			Thread.sleep(3000);
			String expectedtitle = "My Organization - My education - Agenda";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate to the Calendar Option");
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to navigate to the Calendar option"+e);
			Assert.fail();
		}
	    
	}
	@When("User Click on personal agenda option 1.")
	public void user_Click_on_personal_agenda_option_1() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			driver.findElement(By.xpath("//a[@title='Personal agenda']")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on personal agenda"+e);
		}
	}

	@Then("User clicks on Date present.")
	public void user_clicks_on_Date_present() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='calendar']/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[1]/table/tbody/tr/td[6]")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on date"+e);
		}
	}

	@Then("User enter the {string}")
	public void user_enter_the(String string) {
	    
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='title']")).sendKeys(string);
			
		}
		catch(Exception e)
		{
			System.out.println("Not Able to enter title or description"+e);
		}}
	

	@Then("User clicks on add button.")
	public void user_clicks_on_add_button() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[4]/div[11]/div/button/span[@class='ui-button-text']")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on add btn"+e);
		}
	  
	}

	@Then("User navigates the agenda")
	public void user_navigates_the_agenda() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(1000);
			String expectedtitle = "My Organization - My education - Agenda";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate to the personal agenda option");
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to navigate to the personal agenda page"+e);
			Assert.fail();
		}
	}
	@When("User Click on personal agenda option again")
	public void user_Click_on_personal_agenda_option_again() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			driver.findElement(By.xpath("//a[@title='Personal agenda']")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on personal agenda"+e);
		}
	    
	}

	@Then("User Clicks on saved Agenda")
	public void user_Clicks_on_saved_Agenda() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			
			driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[2]/table/tbody/tr/td[6]/a/div[1]/span[@class='fc-title']")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on saved agenda button"+e);
		}
	}

	@Then("User clicks on Edit button")
	public void user_clicks_on_Edit_button() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div[11]/div/button[4]/span[@class='ui-button-text']")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on Edit btn"+e);
		}
	}

	@Then("User navigates the edit agenda tab.")
	public void user_navigates_the_edit_agenda_tab() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(3000);
			String expectedtitle = "My Organization - My education - Edit";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate edit personal agenda option");
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to navigate to navigate edit personal agenda option"+e);
			Assert.fail();
		}
	}

	//@Then("User enter the title and Date range")
	//public void user_enter_the_title_and_Date_range() {
		//try
		//{
			
			 //driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/form/fieldset/div[1]/div[1]/input[@class='form-control']")).sendKeys("Day1");
			 
			  
			 // WebElement ddown = driver.findElement(By.xpath("//*[@id='date_range']"));
			  // Select select = new Select(ddown);
			   
			   
				//System.out.println("Yes I have done it");
			 
			
		
		
		//catch(Exception e)
		//{
			//System.out.println("Not Able to edit "+e);
		//}
	    
	//}
	@Then("User enter the {string} and Date range")
	public void user_enter_the_and_Date_range(String string) {
		try {
			Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/section/form/fieldset/div[1]/div[1]/input[@class='form-control']")).sendKeys(string); 
		System.out.println("Yes I have done it");
		Thread.sleep(3000);
		WebElement ddown = driver.findElement(By.id("date_range"));
		ddown.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[6][@data-range-key='Next Week']")).click();
		System.out.println("Yes I have done it again ");

		}
		catch(Exception e) {
			System.out.println("Not Able to edit "+e);
		}
		
	}



	/*@Then("User clicks on All day option.")
	public void user_clicks_on_All_day_option() {
		try
		{
			Thread.sleep(2000);
		WebElement allday= driver.findElement(By.id("qf_c32206"));
		System.out.println("The checkbox is selection state is - " + allday.isSelected());
		
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on ALL DAY "+e);
		}
	}*/

	@Then("user clicks on Edit Event.")
	public void user_clicks_on_Edit_Event() {
		try
		{
		driver.findElement(By.xpath("//*[@id='add_event_submit']")).click();
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on Add Event Submit "+e);
		}
	}
	@Then("User Clicks on saved Agenda again.")
	public void user_Clicks_on_saved_Agenda_again() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/section[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/div[1]")).click();
		}
		catch(Exception e)
		{
			System.out.println("Not Able to click on saved agenda again "+e);
		}
	}
	@Then("User clicks on Delete option.")
	public void user_clicks_on_Delete_option() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[11]/div[1]/button[5]/span[1]")).click();
		System.out.println(" Deleted ");
		
		}catch(Exception e)
		{
			System.out.println("Not Able to Click on Delete "+e);
		}
		
	}
	
	@Then("User Click on Calendar by week option.")
	public void user_Click_on_Calendar_by_week_option() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[2]/div/button[2][contains(text(),'week')]")).click();
		System.out.println("Selected on Calendar By week ");
		Thread.sleep(4000);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on Calendar by week "+e);
		}
	    
	}
	@Then("User navigates to change the week.")
	public void user_navigates_to_change_the_week() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[1]/div/button[3]")).click();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on Forward btn "+e);
		}
	}

	@Then("User navigates to previous week.")
	public void user_navigates_to_previous_week() {
		try
		{
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[1]/div/button[2]")).click();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on Prev- btn "+e);
			
		}
	    
	}
	
	@Then("User Click on Calendar by Day option.")
	public void user_Click_on_Calendar_by_Day_option() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("//*[@id='calendar']/div[1]/div[2]/div/button[3][contains(text(),'day')]")).click();
		System.out.println("Selected on Calendar By day ");
		Thread.sleep(4000);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on Calendar by day "+e);
		}
	}

	@Then("User click on Today Btn.")
	public void user_click_on_Today_Btn() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("//*[@id='calendar']/div[1]/div[1]/div/button[1]")).click();
		System.out.println("Clicked on Today ");
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on Today btn"+e);
		}
	}

	@Then("User Click on Forward btn")
	public void user_Click_on_Forward_btn() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[1]/div/button[3]")).click();
		System.out.println("Clicked on Forward btn ");
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on forward btn"+e);
		}
	}

	@Then("User Click on Agenda List btn.")
	public void user_Click_on_Agenda_List_btn() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("//*[@id=\"calendar\"]/div[1]/div[2]/div/button[4]")).click();
		System.out.println("Clicked on agenda list btn ");
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on agenda list  btn"+e);
		}
	}

	@Then("User Clicks on agenda list option.")
	public void user_Clicks_on_agenda_list_option() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("//*[@id=\"toolbar-agenda\"]/div/div[1]/a[2]/img[@title='Agenda list']")).click();
		System.out.println("Clicked on agenda list option ");
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on agenda list option "+e);
		}
	}

	@Then("User Navigates the agenda list option.")
	public void user_Navigates_the_agenda_list_option() {
	    // Write code here that turns the phrase above into concrete actions
	    
		try
		{
			Thread.sleep(3000);
			String expectedtitle = "My Organization - My education - Events";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate to the agenda list option");
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to navigate to agenda list option"+e);
			Assert.fail();
		}
	}
	@Then("User click on Sessions plan calendar")
	public void user_click_on_Sessions_plan_calendar() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("//*[@id=\"toolbar-agenda\"]/div/div[1]/a[3]/img")).click();
		System.out.println("Clicked on Sessions plan calendar ");
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on Sessions plan calendar"+e);
		}
	}

	@Then("User navigates the Sessions plan calendar.")
	public void user_navigates_the_Sessions_plan_calendar() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(3000);
			String expectedtitle = "My Organization - My education - Sessions plan calendar";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate to the agenda list option");
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to navigate to agenda list option"+e);
			Assert.fail();
		}
	}

	@Then("User click on previous year.")
	public void user_click_on_previous_year() {
	    // Write code here that turns the phrase above into concrete actions
		
		try
		{
		driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/nav/ul/li[1]/a")).click();
		System.out.println("Clicked on previous year");
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on previous year"+e);
		}
	}
	@Then("User clicks on Date present again.")
	public void user_clicks_on_Date_present_again() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/section[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on date again."+e);
		}
	}

	@Then("User clicks on add button again.")
	public void user_clicks_on_add_button_again() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[11]/div[1]/button[1]/span[1]")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on add btn again"+e);
		}
	}

	@Then("User clicks on saved agenda again")
	public void user_clicks_on_saved_agenda_again() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			
			driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/section[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/div[1]")).click();
			
		}
		catch(Exception e) {
			System.out.println("Not able to click on saved agenda button again"+e);
		}
	}

	@Then("user clicks on edit button")
	public void user_clicks_on_edit_button() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[11]/div[1]/button[4]/span[1]")).click();
		}
		catch(Exception e)
		{
			System.out.println("Not Able to Click on Edit btn "+e);
		}
	}

	@Then("User clicks on edit agenda button to save the edited agenda.")
	public void user_clicks_on_edit_agenda_button_to_save_the_edited_agenda() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		driver.findElement(By.xpath("//*[@id=\"add_event_submit\"]")).click();
		}
		catch(Exception e)
		{
			System.out.println("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/section[1]/form[1]/fieldset[1]/div[5]/div[1]/button[1]/em[1]"+e);
		}
	}

	@Then("User navigate the personal agenda.")
	public void user_navigate_the_personal_agenda() {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			Thread.sleep(2000);
			String expectedtitle = "My Organization - My education - Agenda";
			String actualtitle = driver.getTitle();
			Assert.assertEquals(expectedtitle,actualtitle);
			System.out.println("You are able  to navigate to the personal agenda option");
			
		}
		catch(Exception e)
		{
			System.out.println("Not able to navigate to the personal agenda page"+e);
			Assert.fail();
		}
	}





	
}


	
	




	
	   
	
	
	
	



