package hooks;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.java.After;
	import cucumber.api.java.Before;

	public class Hooksclass {
		
		
		public static WebDriver driver;
		
		@Before
		public void initialization()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SWLAXMIK\\eclipse-workspace\\Cucumber123\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("http://elearningm1.upskills.in/index.php");
		}

		@After
		public void closedriver()
		{
			System.out.println("The browseris closing now");
			driver.quit();
		}
	}

