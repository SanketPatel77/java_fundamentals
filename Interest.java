import java.util.*;

class Interest {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principal amount");
		double principal = scan.nextInt();
		
		System.out.println("Enter Rate");
		double rate = scan.nextInt();
		
		System.out.println("Enter Time");
		double time = scan.nextInt();
		
		double simpleInterest = (principal * rate * time)/100;
		
		System.out.println("Simple interest is : " + simpleInterest);
	}
}
		