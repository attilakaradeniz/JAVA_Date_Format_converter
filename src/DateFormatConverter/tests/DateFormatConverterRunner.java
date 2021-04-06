package DateFormatConverter.tests;



import java.util.Locale;


public class DateFormatConverterRunner {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("US", "en"));
		//System.out.printf("[DateFormatConverterRunner] calling DateFormatConverter.Main.main: ");
		DateFormatConverter.Main.main(args);

	}

}
