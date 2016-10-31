class Thing {
	
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	
	public static int count = 0 ;
	public int id;
	
	public Thing(){
		id = count;
		count++;
	}
	public void showName(){
		System.out.println("Object id: "+id +" "+ description +": "+ name);
	}
	
	public static void showInfo(){
		System.out.println(description);
		// wont work.static methods only works for static instance System.out.println(name);
	}
	
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thing.description = "I am a thing";
		Thing.showInfo();
		System.out.println("Count "+ Thing.count);
		
	
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
	
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Thing.LUCKY_NUMBER);
		System.out.println("Count "+Thing.count);
	}

}
