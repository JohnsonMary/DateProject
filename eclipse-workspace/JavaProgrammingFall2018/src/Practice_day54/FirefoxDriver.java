package Practice_day54;

import java.util.List;

import day54_Polyphormism.WebDriver;

public class FirefoxDriver implements WebDriver{
	
	public void setFirefoxOption(List<String>options) {
		
		for(String option:options) {
			System.out.println("Setting firefox option"+option);
		}
		
	}

	@Override
	public void navigate(String url) {

		System.out.println("Navigate to "+url+" on firefox.");
	}

	@Override
	public void open() {

		System.out.println("Opening firefox browser.");
	}

	@Override
	public void close() {

		System.out.println("Closing firefox browser.");
	}
	

}
