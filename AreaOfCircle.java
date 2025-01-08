import java.util.*;

class AreaOfCircle {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		double radius = scan.nextInt();
		
		double area = (Math.PI * Math.pow(radius,2));
		
		System.out.println("area of circle is : "+ area);
	}
}
	