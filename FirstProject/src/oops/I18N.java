package oops;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18N {

	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("messages", locale);
		// messages_{lang}_{country}
		// messages_hi_IN.properties
		String greet = rb.getString("greet");
		String country = rb.getString("country");
		System.out.println(greet);
		System.out.println(country);
	}

}
