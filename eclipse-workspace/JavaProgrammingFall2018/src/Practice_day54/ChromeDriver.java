package Practice_day54;

import day54_Polyphormism.WebDriver;

public class ChromeDriver implements WebDriver{
	
	public void setChromeOption(String [] options) {
		
		for(String option:options) {
			System.out.println("Setting Chrome option "+option);
		}

	}
	@Override
	public void navigate(String url) {

		System.out.println("Navigate to "+url+" on Chrome.");
	}

	@Override
	public void open() {

		System.out.println("Opening Chrome browser.");
	}

	@Override
	public void close() {

		System.out.println("Closing Chrome browser.");
	}
	

}



