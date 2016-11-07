import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TutorList {
	private ArrayList <Tutor> tutor = new ArrayList <Tutor>();
	private String [] userInfo =  new String[7];

	
	public boolean equal(){
		
			boolean result = false;
			Iterator<Tutor> itr = tutor.iterator();
			
			while (itr.hasNext()) {
				
			    Tutor element = itr.next();
			    if(element.getFirstname().equals(userInfo[1]) && element.getSurname().equals(userInfo[2]))
			    {
			    	result = true;
			    }
			    else result=false;
			}
			
			return result;
	}
	
	
	public void addTutor(){
	   		
			Scanner info = new Scanner(System.in);
			System.out.print("Please enter title: ");
			
			while(info.hasNextLine()){
			
			userInfo[0] = info.nextLine();
			
			System.out.print("Please enter name: ");
			userInfo[1] = info.nextLine();
			
			System.out.print("Please enter surname: ");
			userInfo[2] = info.nextLine();
			
			
			if( !equal()){
			
				System.out.print("Please enter tel: ");
				userInfo[3] = info.nextLine();
				
				System.out.print("Please enter room number: ");
				userInfo[4] = info.nextLine();
				
				System.out.print("Please enter username: ");
				userInfo[5] = info.nextLine();
				userInfo[6] = userInfo[5]; 
				
					
				System.out.print("Plase enter Course size: ");
				String courseSize = info.nextLine(); 
				String[] course = new String[Integer.parseInt(courseSize)];
						
						
			    for (int j = 0; j < course.length; j++ ){
						System.out.print("Please enter the "+ (j+1) +". " +"course name: "  );
						course[j] = info.nextLine();
								
				}
						
				tutor.add(new Tutor(userInfo[0],userInfo[1],userInfo[2],userInfo[3],
							  userInfo[4],userInfo[5],userInfo[6],course));
			
				}
				else {
					System.out.println("This tutor is already added! ");
				}
			
			 break;
			}
		}	
	
	
	
	public void deleteTutor(){
		System.out.println("Please Enter The Username of The Tutor ");
		Scanner input = new Scanner(System.in);
		String  username = input.nextLine();
		
		
		Iterator <Tutor> itr =  tutor.iterator();
		int i = 0;
		while(itr.hasNext()){
			Tutor element = itr.next();
			
			if(element.getUserName().equals(username)){
				tutor.remove(i);
				System.out.println("Tutor has been deleted from the list!");
				break;
			}
			else System.out.println("Tutor is not found in the list! ");
		i++;
		
		}
		input.close();
	}
	
	public void searchByName(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter name of the tutor");
		String text =  input.nextLine();
		
		for (Tutor t: tutor){
			if(t.getFirstname() != null && t.getFirstname().equals(text))
				t.displayTutor();
		}
		
	}
	
	public void searchBySurname(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter surname of the tutor");
		String text =  input.nextLine();
		
		for (Tutor t: tutor){
			if(t.getSurname() != null && t.getSurname().equals(text))
				t.displayTutor();
		}
	
	}
	
	
	public void searchByTelNo(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter telephone number of the tutor");
		String text =  input.nextLine();
		
		for (Tutor t: tutor){
			if(t.getTelNo() != null && t.getTelNo().equals(text))
				t.displayTutor();
		}
		
	}
	
	public void searchByRoomNo(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter room number of the tutor");
		String text =  input.nextLine();
		
		for (Tutor t: tutor){
			if(t.getRoomNo() != null && t.getRoomNo().equals(text))
				t.displayTutor();
		}
		
	}
	
	public void searchByTitle(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter title of the tutor");
		String text =  input.nextLine();
		
		for (Tutor t: tutor){
			if(t.getTitle() != null && t.getTitle().equals(text))
				t.displayTutor();
		}
		
	}
	
	public void searchByCourse(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter course");
		String text =  input.nextLine();
		
		
		Iterator<Tutor> itr= tutor.iterator();
		while(itr.hasNext()){
			
			Tutor element =itr.next();
			for(int i=0;i <element.getCourses().length;i++)
		
				if(element.getCourses()[i].equals(text)){
					element.displayTutor();
			}
		}
		
	}
	
	
	 public void display(){
		 
		 Iterator<Tutor> itr = tutor.iterator();
			
			while (itr.hasNext()) {
				
			    Tutor element = itr.next();
			    element.displayTutor();
			}

	 }
	 public void menu(){
			System.out.println("\n\nPlease Choose an Option ");
			System.out.println("1 Add a New Tutor");
			System.out.println("2 Delete a Tutor");
			System.out.println("3 List All The Tutors");
			System.out.println("4 Search by Name");
			System.out.println("5 Search by Surname");
			System.out.println("6 Search by Telephone Number");
			System.out.println("7 search by Room Number");
			System.out.println("8 Search by Title");
			System.out.println("9 Search by Course");
			System.out.println("0 to Exit");
	 }
	
   	}
