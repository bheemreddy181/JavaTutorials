class OverloadDemo{
	
	void test(){
		
		System.out.println("No parameter");
	}
	
	void test(int a){
		
		System.out.println("a: "+ a);
	}
	
	void test(int a,int b){
		
		System.out.println("a: "+ a+ " b: "+ b);
	}
	
}
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadDemo check = new OverloadDemo();
		
		check.test();
		check.test(10);
		check.test(10,20);
		
		
	}

}
