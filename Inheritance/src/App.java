
public class App {

	public static void main(String[] args) {

		Machine mach1 = new Machine();
		mach1.Start();
		mach1.Stop();
		
		Car car1 =  new Car();
		car1.Start();
		car1.wipeWindShield();
		car1.showInfo();
		
		car1.Stop();
	}

}
