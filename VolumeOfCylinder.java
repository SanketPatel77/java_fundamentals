import java.util.*;

class VolumeOFCylinder {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius ");
		double radius = scan.nextInt();
		
		System.out.println("Enter height ");
		double height = scan.nextInt();
		
		double volume = (Math.PI * Math.pow(radius,2) * height);
		
		System.out.println("volume of cylinder is : "+ volume);
	}
}
	