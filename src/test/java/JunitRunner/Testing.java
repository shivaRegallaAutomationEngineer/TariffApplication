package JunitRunner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
/*System.setProperty("webdriver.chrome.driver", "D:\\shiva selenium  important\\Latest_Jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		*/
		
System.setProperty("webdriver.chrome.driver", "D:\\shiva selenium  important\\Latest_Jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://tariffs-uat.cloudapps.digital/");//get --->webdriver method to the get the url of the browser
		
		//to maximize the browser window
		driver.manage().window().maximize();
		driver.findElement(By.id("user_email")).sendKeys("vara.krishnamraju@digital.trade.gov.uk");
		driver.findElement(By.id("user_password")).sendKeys("Saibaba Password23!");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create measures')]")).click();
		
		
		
	WebElement value=	driver.findElement(By.xpath("(//div[@class='selectize-control single']//input[@type='select-one'])[1]"));
	
	value.sendKeys("vara");
	//driver.findElement(By.xpath("//div[@data-value='R1878901']")).click();

	Thread.sleep(3000);
	//Select value1= new Select(driver.findElement(By.xpath("(//select[@class='selectized'])[1]")));
//	value1.selectByValue("R1878901");
//	value1.selectByIndex(1);
	//value1.selectByVisibleText("A1823230: Vara Regulation (02/08/2018)");
	//selectize-input items has-options full has-items
	List<WebElement> values1=	driver.findElements(By.xpath("//div[@class='selectize-dropdown single']//div[@class='selectize-dropdown-content']//div"));
	
	for(WebElement ele : values1){
		String Text=ele.getText();
		if(Text.contentEquals("A1823230: Vara Regulation (02/08/2018)"))
		{
			ele.click();
			
			
		}
	}
	
/*	Select value1= new Select(driver.findElement(By.xpath("//select[@id='workbasket_forms_create_measures_form_measure_type_series_id']")));
value1.selectByVisibleText("F - Additional duty on sugar, flour");
//value1.selectByIndex(1);
	       */

	WebElement typeMeasure=	driver.findElement(By.xpath("(//div[@class='selectize-control form-control select optional single']//input)[1]"));
	typeMeasure.click();
	
	
	//div[@class='selectize-input items allow-clear has-options full has-items']//div
List<WebElement> values2=	driver.findElements(By.xpath("(//div[@class='selectize-dropdown-content'])[2]//span"));
	//(//div[@class='selectize-dropdown-content'])[2]//span//span[1]
	for(WebElement ele : values2){
		String Text=ele.getText();
		
		if(Text.contentEquals("C"))
		{
			ele.click();
			
			
		}
	}
	WebElement typeMeasure1=	driver.findElement(By.xpath("(//div[@class='selectize-control form-control select optional single']//input)[2]"));
	typeMeasure1.click();
	//---.> (//div[@class='selectize-control form-control select optional single'])[2]//input
	
	
	
	

	
	
	List<WebElement> values3=	driver.findElements(By.xpath("(//div[@class='selectize-dropdown-content'])[3]//span"));
	//(//div[@class='selectize-dropdown-content'])[2]//span//span[1]
	for(WebElement ele : values3){
		String Text=ele.getText();
		System.out.println(Text);
		if(Text.contentEquals("103"))
		{
			ele.click();
			
			
		}
	}
	
	
}}
