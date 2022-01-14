package WebHadir.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebHadir.driver.DriverSingleton;

public class ManageDepartemen {

	private WebDriver driver;

	public ManageDepartemen() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidenav-main\"]/div/div/ul/li[16]/a")
	private WebElement gotoManageDepartemen;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/div/button")
	private WebElement btnTambah;
	
	@FindBy(xpath = "//*[@id=\"zz1\"]")
	private WebElement txtDepartemen;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/button[2]")
	private WebElement btnSubmit1;
	
	@FindBy(xpath = "//*[@id=\"t1\"]/i")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//*[@id=\"zz1\"]")
	private WebElement txtEdit;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/form/button[2]")
	private WebElement btnSumbit2;
	
	@FindBy(xpath = "//*[@id=\"t2\"]/i")
	private WebElement btnHapus;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[3]/button[2]")
	private WebElement btnSubmit3;
}
