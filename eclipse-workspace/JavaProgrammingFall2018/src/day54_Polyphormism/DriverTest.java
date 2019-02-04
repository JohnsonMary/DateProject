package day54_Polyphormism;

public class DriverTest {
	public static void main(String[] args) {
		

		//ChromeDriver w1 = new ChromeDriver();
				// Whether objectType IS-A ReferenceType 
				WebDriver driver1 = new ChromeDriver();
					driver1.open();
					driver1.navigate("cybertekschool.com");
					driver1.close();
					driver1.quit();
					System.out.println("---------------------");
					
				WebDriver driver2 = new FirefoxDriver();
					driver2.open();
					driver2.navigate("cybertekschool.com");
					driver2.close();
					driver2.quit();
					System.out.println("---------------------");
					
				WebDriver driver3 = new ChromeDriver();
					driver3.open();
					driver3.navigate("cybertekschool.com");
					driver3.close();
					driver3.quit();
					System.out.println("---------------------");
					
				
				WebDriver[] drivers = { driver1,driver2,driver3 } ; 
		////WebDriver[] drivers = {new ChromeDriver() , new FirefoxDriver(), new ChromeDriver() } ; 
		////   String[] str     = {"abc"              , "efg"              , "xyz"} ;  
//				
				for (WebDriver driver : drivers) {
					driver.open();
					driver.navigate("cybertekschool.com");
					driver.close();
					driver.quit();
					System.out.println("---------------------");
				}
//				
//				


				 
				
				// DRY PRINCIPLE 
				// DON'T REPEAT YOURSELF 
				
				/// OPEN CHROME - NAVIGATE - CLOSE - QUIT
				/// OPEN FIREFOX - NAVIGATE - CLOSE - QUIT
				/// OPEN CHROME - NAVIGATE - CLOSE - QUIT
				
			/*	list version:List<WebDriver> list = new ArrayList<>();
				list.add(new ChromeDriver());
				list.add(new FireFoxDriver());
				list.add(new ChromeDriver());
				System.out.println("==========");
				for (WebDriver drv : list) {
					drv.navigate("Cybertek.com");
					drv.open();
					drv.close();
					drv.quit();
					System.out.println("==========");
				} */
				
				
				

			}

		}

