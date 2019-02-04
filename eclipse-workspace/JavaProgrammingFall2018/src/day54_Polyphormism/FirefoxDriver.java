package day54_Polyphormism;

import java.util.List;

public class FirefoxDriver implements WebDriver{

public void setFireFoxOption(List<String> options) {
		
		for (String option : options) {
			System.out.println("setting firefox opetion " + option);
		}
		
	}

	@Override
	public void navigate(String url) {
		System.out.println("navigating to "+ url + " on firefox");
	}

	@Override
	public void open() {
		System.out.println("opening firefox browser");
	}

	@Override
	public void close() {
		System.out.println("closing firefox browser");
	}

}