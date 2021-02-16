package stepDefinations;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailAttachment {
	static WebDriver driver;

	@Given("^Valid user logs in to Gmail with username and password$")
	public void valid_user_logs_in_to_Gmail_with_username_and_password() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sachin\\eclipse-workspace\\Gmail_Attachment_1.0\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("tselenium182@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Computer*1993");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
		Thread.sleep(2000);
	}

	@When("^User logged in using user name and password navigates to gmail inbox$")
	public void user_logged_in_using_user_name_and_password_navigates_to_gmail_inbox() throws Throwable {
		System.out.println("bef");
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		System.out.println("aft");
	}

	@And("^User need to click on compose email button$")
	public void user_need_to_click_on_compose_email_button() throws Throwable {
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
	}

	@And("^User need to add text in subject and body of email$")
	public void user_need_to_add_text_in_subject_and_body_of_email() throws Throwable {
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Sample text added in the subject");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi, this is a sample body message");
		Thread.sleep(3000);
	}

	@And("^User need to click on add attachment$")
	public void user_need_to_click_on_add_attachment() throws Throwable {
		driver.findElement(By.xpath("//div[@class='aDh']/table/tbody/tr/td[4]/div/div[@data-tooltip='Attach files']"))
				.click();
		Thread.sleep(5000);
		uploadFile("C:\\Users\\Sachin\\Desktop\\abc.txt");
		Thread.sleep(6000);
	}

	@And("^User need to add email reciepient$")
	public void user_need_to_add_email_reciepient() throws Throwable {
		driver.findElement(By.xpath("//form[@enctype='multipart/form-data']/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@role='combobox']")).sendKeys("sachin.kulkarni164164@gmail.com");
		Thread.sleep(4000);
	}

	@Then("^User click on send button$")
	public void user_click_on_send_button() throws Throwable {
		driver.findElement(By.xpath("//div[contains(@data-tooltip,'Send')]")).click();
	}
	public static void setClipboardData(String string) {
		// StringSelection is a class that can be used for copy and paste operations.
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public static void uploadFile(String fileLocation) {
		try {
			// Setting clipboard with file location
			setClipboardData(fileLocation);
			// native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

}
