
class Person{
	
	String name;
	int age;
	void speak(){
		System.out.println("Hello");
	}
	
}


public class Application {
	public static void main(String[] args) {
		
		Person person1=new Person();
		
		person1.name="emre";
		person1.age=28;
		
		
		System.out.println(person1.name);
		person1.speak();
		
		
		
		
	}

}
