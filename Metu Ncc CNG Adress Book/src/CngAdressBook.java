import java.util.Scanner;

public class CngAdressBook {

	public static void main(String[] args) {

		TutorList list = new TutorList();
		
		Scanner input = new Scanner(System.in);
	    list.menu();
		
		
		int loop = input.nextInt();
		
		
		while(loop != 0 ){
		
			switch(loop){
			
			case 1 : list.addTutor();
				   break;
			
			case 2 : 
				     list.deleteTutor();
				   break;
			
			case 3 : list.display();
				   break;
		
			case 4 : list.searchByName();
				   break;
				   
			case 5 : list.searchBySurname();
				   break;
			
			case 6 : list.searchByTelNo();
				   break;
			
			case 7 : list.searchByRoomNo();
				   break;
				
			case 8 : list.searchByTitle();
				   break;
				   
			case 9 : list.searchByCourse();
				   break;
		
			default: System.out.println("Enter correct parameters");
					break;
			}
			list.menu();
			loop = input.nextInt();
		}
		input.close();
	}

}
