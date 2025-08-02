package OOPS;
import java.util.*;

public class GreatestNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		double one=sc.nextDouble();
		
		System.out.println("Enter Second Number: ");
		double two=sc.nextDouble();
		
		System.out.println("Enter Third Number: ");
		double three=sc.nextDouble();
		
		if(one>two && one>three) {
				System.out.print(""+one);
				System.out.println(" is the Greatest Number.");
		}
		
		else if(two>one && two>three) {
			System.out.print(""+two);
			System.out.println(" is the Greatest Number.");
		}
		
		else if(three>one && three>two) {
			System.out.print(""+three);
			System.out.println(" is the Greatest Number.");
		}
		
		else if(one>=two && one>three) {
			System.out.println("A=B="+one);
			System.out.println(" is the Greatest Number.");
		}
		
		
	}
}
