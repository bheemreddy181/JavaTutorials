
public class Car extends Machine {



	
	@Override
	public void Start() {
		// TODO Auto-generated method stub
		super.Start();
	}

	public void wipeWindShield(){
		System.out.println("Wiping wind shield");
	}
	public void showInfo(){
		System.out.println("Car name: "+name);
	}
}
