import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*ArrayList<Object> al = new ArrayList<>();
		al.add( Integer.valueOf(10) );
		al.add(100);
		al.add(1919191919191l);
		al.add('a');
		al.add("Hello");
		al.add(true);
		al.add(new int[10]);
		al.add(new ArrayList<>());
		al.add(BigInteger.valueOf(1919919191991l));
		al.add(new Array2DDemo());
		al.add(new int[4][]);
		System.out.println(al);
		
		Integer i = Integer.valueOf(10);
		Integer i2 = new Integer(100);
		Integer i3 = 1000;
		Boolean b = true;
		// Autoboxing
		
		int arr[][] = new int[5][];
		System.out.println(Arrays.toString(arr));
		
		arr[0] = new int[5];
		arr[1] = new int[4];
		arr[2] = new int[3];
		arr[3] = new int[6];
		arr[4] = new int[7];
		System.out.println(Arrays.toString(arr));*/
		
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("Java");
		subjects.add("English");
		subjects.add("French");
		subjects.add("Computer Science");
		subjects.add("Chemistry");
		subjects.add("Physics");
		subjects.add(3, "PhD");
		subjects.set(2, "Spanish");
		System.out.println(subjects);
		
		System.out.println("Subject number 5 is - " + subjects.get(4));
		System.out.println("Index of PhD is " + subjects.indexOf("PHD"));
		subjects.remove(4);
		subjects.remove("PhD");
		System.out.println(subjects);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(23);
		al2.add(13);
		al2.add(3);
		al2.add(2);
		al2.add(5);
//		al2.remove(5);
		al2.remove(Integer.valueOf(23));
		System.out.println(al2);
		
	}

}
