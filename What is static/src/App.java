
public class App {

	public static void main(String[] args) {

		Animals dog =  new Animals();
		Animals cat =  new Animals();
		
/*
		dog.sayMyName("Lucky"); // It is not belongs to the instance. It belongs to the Class (Animals).
		cat.sayMyName("Micha"); //Thus it gives a warning
		
*/
		Animals.sayMyName("This is the correct usage of static method");
		
		dog.sayMyType("Lucky");
		cat.sayMyType("micha");
	}

}
