package Packages;

import java.security.KeyStore.Entry.Attribute;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Packagescort {

	private static final String Timeunits = null;
	private static final long MB = 0;
	private Object Timeunit;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		//driver.findElement(By.linkText("Gmail")).click();
		
	/*WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String url = "https://accounts.google.com/signin";
        driver.get(url);
        driver.findElement(By.id("identifierId")).sendKeys("cp8805"); 
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
        WebDriverWait wait=new WebDriverWait(driver, 20);               
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();         
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);        
        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("xxxxxx");             
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); */
		
		
		/*String url="https://www.seleniumhq.org/";
		driver.get(url);
		
		driver.findElement(By.xpath(".//*[@id='menu_projects']/a")).click();
		driver.findElement(By.xpath(".//*[@id='mainContent']/div/h3[1]/a")).click();*/
		
		String url="https://www.google.co.in/";
		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Gmail")).click();
		driver.manage().timeouts().implicitlyWait(3 ,TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("saikumar.amtesting");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
        driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("srivalli@488");
        
        driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
        
    	driver.manage().timeouts().implicitlyWait(3 ,TimeUnit.SECONDS);
    	Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
		driver.findElement( By.xpath(".//*[@id='gb_71']")).click();
		Thread.sleep(2);
	
		driver.close();
		
		
		
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		
		//Here we are storing the value from the cell in to the string variable
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(sCellValue);
		
		// Here we are clicking on the link of first row and the last column
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		System.out.println("Link has been clicked otherwise an exception would have thrown");
		driver.close();
*/	
	/*	
		String url="file:///C:/Users/SAi/Desktop/table.html";
		driver.get(url);
		//String sRow="1";
		//String sCol="2";
		String pagesource=driver.getPageSource();
        //driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[1]"));
        
		*/
		
	}

	private static Object getLogger() {
		Runtime r = Runtime.getRuntime();
		((Object) getLogger()).info( "Final Memory: " + ( r.totalMemory() - r.freeMemory() ) / MB + "M/" + r.totalMemory() / MB + "M" ); 
		
		return null;
	}
	

		
	}
		
		
		




