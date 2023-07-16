package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTestCases {
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
public void userCanApply() {
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SUHAS PATIL");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("suhasp1213@gmail.com");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8830734807");
	driver.findElement(By.xpath("//input[@name='notice_time']")).sendKeys("15");
	driver.findElement(By.xpath("//input[@name='experience']")).sendKeys("3.6");
	driver.findElement(By.xpath("//input[@name='resume']")).sendKeys("D:\\suhas\\Resume\\QA_suhas.pdf");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("3+ experience in manual testing, atomation testing, api testing and database testing");
	driver.findElement(By.xpath("//button[text()='APPLY NOW']")).click();
}
@Test
public void clickOnShopify() {
	driver.findElement(By.xpath("(//a[@class='nav-link '])[8]")).click();
}
@Test
public void clickonblog() {
	driver.findElement(By.xpath("(//a[@class='nav-link '])[9]")).click();
}
@Test
public void clickonCareers() {
	driver.findElement(By.xpath("(//a[@class='nav-link '])[10]")).click();
}
@Test
public void clickoncasestudies() {
	driver.findElement(By.xpath("(//a[@class='nav-link '])[11]")).click();
}
@Test
public void clickonAboutUs() {
	driver.findElement(By.xpath("(//a[@class='nav-link '])[12]")).click();
}
@Test
public void clickonContactUs() {
	driver.findElement(By.xpath("(//a[@class='nav-link '])[13]")).click();
}
@Test
public void moveToServiceAndClickWordPressDevelopment() {
	Actions act=new Actions(driver);
	WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
	act.moveToElement(service).perform();
	driver.findElement(By.xpath("(//a[@class='nav-link '])[2]")).click();
}
@Test
public void moveToServiceAndClickBlockChainDevelopment() {
	Actions act=new Actions(driver);
	WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
	act.moveToElement(service).perform();
	driver.findElement(By.xpath("(//a[@class='nav-link '])[3]")).click();
}
@Test
public void moveToServiceAndClickDesignAndProtoTyping() {
	Actions act=new Actions(driver);
	WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
	act.moveToElement(service).perform();
	driver.findElement(By.xpath("(//a[@class='nav-link '])[4]")).click();
}
@Test
public void moveToServiceAndClickWordFileMakerProDevelopmentDevelopment() {
	Actions act=new Actions(driver);
	WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
	act.moveToElement(service).perform();
	driver.findElement(By.xpath("(//a[@class='nav-link '])[5]")).click();
}
@Test
public void moveToServiceAndClickUiDevelopment() {
	Actions act=new Actions(driver);
	WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
	act.moveToElement(service).perform();
	driver.findElement(By.xpath("(//a[@class='nav-link '])[6]")).click();
}
@Test
public void moveToServiceAndClickDbAndBackendDvelopment() {
	Actions act=new Actions(driver);
	WebElement service=driver.findElement(By.xpath("(//a[@class='nav-link '])[1]"));
	act.moveToElement(service).perform();
	driver.findElement(By.xpath("(//a[@class='nav-link '])[7]")).click();
}
@Test
public void clickOnLinkedin() {
	WebElement linkedin=driver.findElement(By.xpath("//img[@alt='linkedin']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();",linkedin);
}
@Test
public void clickOnFacebook() {
	WebElement facebook=driver.findElement(By.xpath("//img[@alt='facebook']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();",facebook);
}
@Test
public void clickOnInstagram() {
	WebElement instagram=driver.findElement(By.xpath("//img[@alt='instagram']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();",instagram);
}
@Test
public void clickOnTopWebDevelopmentCompanyLogo() {
	WebElement webDevelopmentcomp=driver.findElement(By.xpath("//img[@class='footer-img']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();",webDevelopmentcomp);
}
@Test
public void clickOnweDeliverClutchLogo() {
	WebElement clutch=driver.findElement(By.xpath("//img[@class='footer-img-clutch']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();",clutch);
}
@Test
public void HashTagLogo() {
	driver.findElement(By.xpath("(//img[@id='logo'])[1]")).click();
}
}
