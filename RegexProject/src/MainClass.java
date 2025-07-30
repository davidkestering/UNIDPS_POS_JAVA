import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
	public static void main(String[] args) {
		String email = "davidkestering@gmail.com";
		System.out.println(email.matches("^[\\w.-_]+@[\\w]+\\.[a-zA-Z0-9]{2,6}"));
		
		String texto = "O CEP da residencia é 67120-370";
		Pattern pattern = Pattern.compile("\\d{5}-\\d{3}");
		Matcher matcher = pattern.matcher(texto);
		if (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
