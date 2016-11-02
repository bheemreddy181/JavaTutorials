
public class Student {

	String name;
	int age;
	static int noOfStudents = 0;
	
	Student(){
		noOfStudents++;
	}
	
	public static int getNoOfStudents(){
		return noOfStudents;
	}
	public String getName(){
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
