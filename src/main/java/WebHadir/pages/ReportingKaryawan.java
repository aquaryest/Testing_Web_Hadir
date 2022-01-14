package WebHadir.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebHadir.driver.DriverSingleton;

public class ReportingKaryawan {

	private WebDriver driver;

	public ReportingKaryawan() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"sidenav-main\"]/div/div/ul/li[7]/a")
	private WebElement gotoReportingKaryawan;

	@FindBy(xpath = "//select[@class='form-control-alternative form-control']")
	private WebElement dropdownList;

	@FindBy(xpath = "//option[@value='nik']")
	private WebElement listNik;

	@FindBy(xpath = "//option[@value='name']")
	private WebElement listName;
	
	@FindBy(xpath = "//option[@value='name']")
	private WebElement listLeader;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div[1]/form/div/div[3]/div/input")
	private WebElement masukkanInputan;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement btnSearch;


	public void gotoReportingKaryawan() {
		gotoReportingKaryawan.click();
	}

	public void klikDropdownList() {
		dropdownList.click();
	}

	//////// Search by NIK /////////////

	public void klikListNik() {
		listNik.click();
	}

	public void searchByNik(String nik) throws InterruptedException {
		masukkanInputan.sendKeys(nik);
		btnSearch.click();
		Thread.sleep(4000);
	}

	//////// Search by Name /////////////

	public void klikListName() {
		listName.click();
	}

	public void searchByName(String name) throws InterruptedException {
		masukkanInputan.clear();
		masukkanInputan.sendKeys(name);
		btnSearch.click();
		Thread.sleep(4000);
	}

	////////Search by Name /////////////

	public void klikListLeader() {
		listLeader.click();
	}

	public void searchByLeader(String leader) throws InterruptedException {
		masukkanInputan.clear();
		masukkanInputan.sendKeys(leader);
		btnSearch.click();
		Thread.sleep(4000);
		
	}
}
