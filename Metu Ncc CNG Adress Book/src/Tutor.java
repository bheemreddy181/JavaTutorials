import java.util.Arrays;

public class Tutor {

	private String title;
	private String firstname;
	private String surname;
	private String telNo;
	private String roomNo;
	private String userName;
	private String email;
	private String [] Courses = new String[5];
	
	
	Tutor(String title, String firstname, String surname, String telNo, String roomNo, String userName, String email, String [] Courses){
		
		this.title = title;
		this.firstname = firstname;
		this.surname = surname;
		this.telNo =telNo;
		this.roomNo =roomNo;
		this.userName = userName;
		this.email = email.concat("@metu.edu.tr") ;
		this.Courses = Courses; 
	}
	
	public void displayTutor(){
		System.out.println("Tutors Info");
		System.out.println(title + " "+ firstname+ " "+ surname+ " "+ telNo+ " "+ roomNo+ " "+ userName+ " "+ email);

		for(int i = 0; i< Courses.length ;i++)
			if(Courses[i]!=null && !Courses[i].isEmpty())
				System.out.println(Courses[i]);
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		System.out.println("title is" + title);
		this.title = title;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email+"@metu.edu.tr";
	}
	public String[] getCourses() {
		return Arrays.copyOf(Courses,Courses.length);
	}
	public void setCourses(String[] courses) {
		Courses =Arrays.copyOf(courses,courses.length);
	}
	
	
}
