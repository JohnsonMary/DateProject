package day54_Polyphormism;

public class ChromeDriver implements WebDriver{

public void setChromeOption(String[] options) {
		
		for (String option : options) {
			System.out.println("setting chrome opetion " + option);
		}
		
	}
	
	@Override
	public void quit(){
		System.out.println("chrome quit special");
	}
	
	
	@Override
	public void navigate(String url) {
		System.out.println("navigating to "+ url + " on chrome");
	}

	@Override
	public void open() {
		System.out.println("opening chrome browser");
	}

	@Override
	public void close() {
		System.out.println("closing chrome browser");
	}

	
	
}