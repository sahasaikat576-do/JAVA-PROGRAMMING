import java.util.Scanner;

class Area_Triangle{
	public static void main(String[] args){
	// creating an object scanner to read user input
	Scanner scanner= new Scanner(System.in);
	
	// asking the user to give the value of base
	int base= scanner.nextInt();
	
	// asking the user to give the value of height
	
	int height= scanner.nextInt();
	
	// area of the the triangle in inches
	double Area_inches= (0.5)*base*height;
	
	// convert the are in centimeters
	 double Area_centimeters=1.6* Area_inches;
	 // Display the result
	System.out.println("Area in inches"  +Area_inches+ "Area in centimeters" + Area_centimeters);
}

}	
		

