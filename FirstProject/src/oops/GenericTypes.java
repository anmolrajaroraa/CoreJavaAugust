package oops;

import java.util.ArrayList;
import java.util.HashMap;

class Box<T>{
	private T x;
	
	public void setX(T x) {
		this.x = x;
	}
	public T getX() {
		return x;
	}
}

class NewBox<K,V>{
	private K key;
	private V value;
}

public class GenericTypes {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setX(10);
//		box.setX("ten");
//		box.setX(10.0);
//		
//		int value = (int) box.getX();
//		System.out.println(value);
		
		Box<Integer> box = new Box<>();
		box.setX(10);
		int x = box.getX();
		
		Box<String> box2 = new Box<>();
		Box<int[]> box3 = new Box<>();
		Box<Box<Integer>> box4 = new Box<>();
		Box<ArrayList<String>> box5 = new Box<>();
		
		NewBox<String, Integer> subjects = new NewBox<>();
		HashMap<String, Integer> subjects2 = new HashMap<>();
	}

}
