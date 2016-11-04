
public class OverloadConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box mybox1 = new Box(10,20,15);
		Box mybox2 = new Box();
		Box mybox3 = new Box(7);
		
		double vol;
		
		
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		

		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		

		// get volume of cube
		vol = mybox3.volume();
		System.out.println("Volume of cube is " + vol);
	}

}
