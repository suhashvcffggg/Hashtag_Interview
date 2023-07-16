package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionalTest {
	static WebDriver driver;

	@BeforeClass
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void enterName() {
		WebElement entername=driver.findElement(By.xpath("//input[@name='name']"));
		entername.sendKeys("SUHAS PATIL");
		Assert.assertEquals(entername.getAttribute("value"), "SUHAS PATIL");
		
	}
	@Test
	public void enterMail() {
		WebElement mail=driver.findElement(By.xpath("//input[@name='email']"));
		mail.sendKeys("suhasp1213@gmail.com");
		Assert.assertEquals(mail.getAttribute("value"), "suhasp1213@gmail.com");
	}
	@Test
	public void enterPhone() {
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("8830734807");
		Assert.assertEquals(phone.getAttribute("value"), "8830734807");
	}
	@Test
	public void enterNoticePeriod() {
		WebElement noticeperiod=driver.findElement(By.xpath("//input[@name='notice_time']"));
		noticeperiod.sendKeys("15");
		Assert.assertEquals(noticeperiod.getAttribute("value"), "15");
	}
	@Test
	public void enterExperience() {
		WebElement experience=driver.findElement(By.xpath("//input[@name='experience']"));
		experience.sendKeys("3.6");
		Assert.assertEquals(experience.getAttribute("value"), "3.6");
	}
	@Test
	public void clickOnApply() {
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='APPLY NOW']")).isEnabled());
	}
	@Test
	public void clickOnShopify() {
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[8]")).isEnabled());
	}
	@Test
	public void clickonblog() {
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[9]")).isEnabled());
	}
	@Test
	public void clickonCareers() {
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[10]")).isEnabled());
	}
	@Test
	public void clickoncasestudies() {
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[11]")).isEnabled());
	}
	@Test
	public void clickonAboutUs() {
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[12]")).isEnabled());
	}
	@Test
	public void clickonContactUs() {
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[13]")).isEnabled());
	}
	@Test
	public void moveToServiceAndClickWordPressDevelopment() {
		Actions act=new Actions(driver);
		WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
		act.moveToElement(service).perform();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[2]")).isEnabled());
	}
	@Test
	public void moveToServiceAndClickBlockChainDevelopment() {
		Actions act=new Actions(driver);
		WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
		act.moveToElement(service).perform();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[3]")).isEnabled());
	}
	@Test
	public void moveToServiceAndClickDesignAndProtoTyping() {
		Actions act=new Actions(driver);
		WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
		act.moveToElement(service).perform();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[4]")).isEnabled());
	}
	@Test
	public void moveToServiceAndClickWordFileMakerProDevelopmentDevelopment() {
		Actions act=new Actions(driver);
		WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
		act.moveToElement(service).perform();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[5]")).isEnabled());
	}
	@Test
	public void moveToServiceAndClickUiDevelopment() {
		Actions act=new Actions(driver);
		WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
		act.moveToElement(service).perform();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[6]")).isEnabled());
	}
	@Test
	public void moveToServiceAndClickDbAndBackendDvelopment() {
		Actions act=new Actions(driver);
		WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
		act.moveToElement(service).perform();
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@class='nav-link '])[7]")).isEnabled());
	}
	
	@Test
	public void HashTagLogo() {
		Assert.assertTrue(driver.findElement(By.xpath("(//img[@id='logo'])[1]")).isEnabled());
	}
}
