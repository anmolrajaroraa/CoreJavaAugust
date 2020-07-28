import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Long> phoneBook = new HashMap<>();
		phoneBook.put("Pankaj", 1234567898l);
		phoneBook.put("Pooja", 4848484848l);
		phoneBook.put("Bharti", 123434353598l);
		phoneBook.put("Avanish", 1234453554l);
		
		System.out.println("Number is " + phoneBook.get("Bharti"));
		System.out.println(phoneBook.containsKey("Pooja"));
	}

}
