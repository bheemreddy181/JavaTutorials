
public class Machine implements Info{

	private int id = 7;
	
	public void Start(){
		System.out.println("Machine started");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Machine Id :"+ id);
	}
}
