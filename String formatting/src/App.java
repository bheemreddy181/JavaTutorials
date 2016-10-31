
public class App {
	public static void main(String[] args) {
		
		//Inefficient
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		

		System.out.println(info);
		
		//More Efficient for memory
		StringBuilder sb = new StringBuilder();
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		// Second way
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Joe.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		// thread safe version of string builder is string buffer
		
		
		//FORMATTING
		
		System.out.print("Here is some text.\tThat was a tab.\nThat was a newline\n");
		System.out.println("More text.");
		System.out.printf("Total cost %-10d; quantity is %d\n",5,10);
		
		for(int i = 0; i<20 ; i++)
			System.out.printf("%2d : some text here\n",i);
		
		
		
	}

}
