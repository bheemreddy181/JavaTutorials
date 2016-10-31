
class Robot {
	
	public void speak(String text){
		
		System.out.println(text);
	}
	
	public void jump (int height){
		
		System.out.println("Jumping " + height+ " meters");
	}
	
	public void move (String direction, double distance){
		
		System.out.println("Moving " + direction+ " with "+ distance);
	}
}
public class Application {
	public static void main(String[] args) {
		
		Robot Sam =  new Robot();
		
		Sam.speak("Hi I am Sam");
		Sam.jump(10);
		Sam.move("right",455.89);
	}
}
