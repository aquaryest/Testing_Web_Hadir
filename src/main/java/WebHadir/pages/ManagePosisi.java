package WebHadir.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebHadir.driver.DriverSingleton;

public class ManagePosisi {

	private WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public ManagePosisi() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"sidenav-main\"]/div/div/ul/li[13]/a")
	private WebElement gotoManagePosisi;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/div/button")
	private WebElement btnTambah;
	
	@FindBy(xpath = "//*[@id=\"zz1\"]")
	private WebElement txtPosisi;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/form/button[2]")
	private WebElement btnSubmit1;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[55]/td[3]/button[1]/i")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//*[@id=\"zz1\"]")
	private WebElement txtEdit;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/form/button[2]")
	private WebElement btnSubmit2;
	
	@FindBy(xpath = "//*[@id=\"t2\"]/i")
	private WebElement btnHapus;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[3]/button[2]")
	private WebElement btnSubmit3;
	
	public void gotoManagePosisi() throws InterruptedException {
		WebElement Element = driver.findElement(By.xpath("//*[@id=\\\"sidenav-main\\\"]/div/div/ul/li[13]/a"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);
		gotoManagePosisi.click();
	}
	
	////////// ADD NEW POSITION //////////
	
	public void clickTambah() {
		btnTambah.click();
	}
	
	public void inputPosisi(String posisi) throws InterruptedException{
		txtPosisi.sendKeys(posisi);
		btnSubmit1.click();
		Thread.sleep(4000);
	}
	
	////////// EDIT POSITION //////////
	
	public void clickEdit() throws InterruptedException {
		WebElement Element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[55]/td[3]/button[1]/i"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);
		btnEdit.click();
	}
	
	public void editPosisi(String edit) throws InterruptedException{
		txtEdit.clear();
		txtEdit.sendKeys(edit);
		btnSubmit2.click();
		Thread.sleep(4000);
	}
	
	////////// REMOVE POSITION //////////
	
	public void removePosisi() {
		btnHapus.click();
		
	}
}
