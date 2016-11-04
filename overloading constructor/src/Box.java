
public class Box {

	double width;
	double height;
	double depth;
	
	// default constructor 
	
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
	
	// This is the constructor for Box
	Box(double w, double h, double d){
		
		width = w;
		height = h;
		depth = d;
	}
	
	// Constructor used when cube is created
	
	
	Box(double len){
		
		width = height = depth = len;
	}
	
	double volume(){
		
		return width * height * depth;
	}
}
