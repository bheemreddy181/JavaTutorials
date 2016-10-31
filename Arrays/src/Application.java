import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 7;
		
		int[] values;
		
		values = new int [3];
		
		Scanner input = new Scanner(System.in);
		
		int i=0;
		
		while (i < values.length){
			
			values[i]=input.nextInt();
			System.out.println(values[i]);
			i++;
		}
	}

}
