import java.util.*;

class PerimeterOfRectangle {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length");
		double length = scan.nextInt();
		
		System.out.println("Enter width");
		double width = scan.nextInt();
		
		double perimeter = 2 * (length * width);
		
		System.out.println("Perimeter of rectangle is : " + perimeter);
		
	}
}
		