package testSU.Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.WebdriverManager;

public class Homepage extends WebdriverManager {

	WebDriver driver;

	// Test 1
	@FindBy(xpath = "//*[@id=\"inputPassword\"]")
	private WebElement passwordTB;
	@FindBy(xpath = "//*[@id=\"test-1-div\"]/form/button")
	private WebElement signInBtn;
	@FindBy(xpath = "/html/body/div/div[1]/div/form/input[1]")
	private WebElement emailAddressTB;

	// Test 2

	@FindBy(xpath = "//*[@id=\"test-2-div\"]/ul")
	private WebElement listGroup;
	@FindBy(xpath = "//*[@id=\"test-2-div\"]/ul/li[2]")
	private WebElement listItem2;
	@FindBy(xpath = "//*[@id=\"test-2-div\"]/ul/li[2]/span")
	private WebElement badgeValueList2;

	// Test 3

	@FindBy(xpath = "/html/body/div/div[3]/div/div/button")
	private WebElement defaultOption1;
	@FindBy(xpath = "//*[@id=\"test-3-div\"]/div/div/a[3]")
	private WebElement Option3L;
	@FindBy(xpath = "/html/body/div/div[3]/div/div/div/a[3]")
	private WebElement Option3;		
	

	// Test 4

	@FindBy(xpath = "//*[@id=\"test-4-div\"]/button[1]")
	private WebElement firstButton;
	@FindBy(xpath = "//*[@id=\"test-4-div\"]/button[2]")
	private WebElement secondButton;

	// Test 5

	@FindBy(xpath = "//*[@id=\"test5-button\"]")
	private WebElement buttonTest5;
	@FindBy(xpath = "//*[@id=\"test5-alert\"]")
	private WebElement successAlert;

	// Test 6

	@FindBy(xpath = "//*[@id=\"test-6-div\"]/div/table")
	private WebElement gridCell;
	@FindBy(xpath = "/html/body/div/div[6]/div/div/table/tbody/tr[3]/td[3]")
	private WebElement coordinate2;

	// Test 1

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("driver inside const" + driver);
	}

	public void checkFields() {
		Assert.assertEquals(true, emailAddressTB.isDisplayed());
		Assert.assertEquals(true, passwordTB.isDisplayed());
		Assert.assertEquals(true, signInBtn.isDisplayed());

	}

	public void sendInput(String emailAddress, String password) {

		emailAddressTB.sendKeys(emailAddress);
		passwordTB.sendKeys(password);
		signInBtn.click();

	}

	// Test 2

	public void listGroup() {

		int listGrouplist = driver
				.findElements(By.xpath("//li[contains(@class,'list-group-item justify-content-between')]")).size();
		Assert.assertEquals(3, listGrouplist);
	}

	public void listItem2Check() {

		String listItem = listItem2.getText();
		Assert.assertEquals("List Item 2 6", listItem);
		
	}
	public void badgeValueCheck() {
		
		String badgeValue = badgeValueList2.getText();
		Assert.assertEquals("6", badgeValue);
	}
	

	// Test 3
	public void option1Select() {

		String opt1 = defaultOption1.getText();
		Assert.assertEquals(opt1, "Option 1");

	}

	public void option3Select() throws InterruptedException {
		Thread.sleep(1000);
		defaultOption1.click();
		//Select drpOption3 = new Select(defaultOption1);
		//drpOption3.selectByValue("Option 3");
		Option3.click();

	}

	// Test 4
	public void buttonEnabled() {
		Assert.assertEquals(true, firstButton.isEnabled());
		Assert.assertEquals(false, secondButton.isEnabled());

	}

	// Test 5
	public void buttonDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOf(buttonTest5)).click();

	}

	public void successMessage() {
		String success = successAlert.getText();
		Assert.assertEquals(success, "You clicked a button!");
	}

	public void buttonDisabled() {
		Assert.assertEquals(false, buttonTest5.isEnabled());

	}

	// Test 6

	public void cellGrid() {

		// Get all rows
		List<WebElement> rows = gridCell.findElements(By.tagName("tr"));
		System.out.println("rows:" + rows);
		for (WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for (WebElement col : cols) {
				System.out.print(col.getText() + "\t");

			}

		}

	}

	public void coordinateCell() {

		String coordinate = coordinate2.getText();
		System.out.println("coordinate1"+coordinate);

	}

	public void checkCoordinate() {
		String coordinate1 = coordinate2.getText();
		
		Assert.assertEquals("Ventosanzap", coordinate1);
	}
	
	public void afterALL() {
		driver.close();
	}
}