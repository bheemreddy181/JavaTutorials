import java.util.ArrayList;
import java.util.HashMap;
class Animal{
	
}

public class App {

	public static void main(String[] args) {
		
		
		//Generics Before java 5
		
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String) list.get(1);
		System.out.println(fruit);
		
		//// Modern Style
		
		ArrayList <String> Strings =new ArrayList<String>();
		Strings.add("Cat");
		Strings.add("dog");
		Strings.add("bird");
		
		String animal = Strings.get(1);
		System.out.println(animal);
		
		///// There can be more than one type argument
		
		HashMap<Integer, String> map =  new HashMap<Integer,String>();
		
		/// java 7 style
		
		ArrayList <Animal> somelist = new ArrayList<>();
		
		
	}

}
