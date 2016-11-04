class Outer{
	
	int outer_X = 100;
	
	void test(){
		for(int i = 0; i<10;i++){
		class Inner{
			int y = 10; // y is local to inner
		
			void display(){
				System.out.println("display: outer_X = " + outer_X);
			}
		}
		
		Inner inner =new Inner();
		inner.display();
		}
	
	}
}	
	

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer outer = new Outer();
		outer.test();

	}

}
