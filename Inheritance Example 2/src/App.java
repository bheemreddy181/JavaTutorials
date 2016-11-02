
public class App {

	public static void main(String[] args) {
	
		Rectangle rec = new Rectangle ();
		Triangle tri = new Triangle ();
		rec.set_values(10, 15);
		tri.set_values(10, 8);
		
		System.out.println(rec.area());
		System.out.println(tri.area());
	}

}
