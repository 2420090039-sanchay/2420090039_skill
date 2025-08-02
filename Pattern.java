package OOPS;
import java.util.*;

public class Pattern {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		int j=1;
		System.out.println("Enter the Number: ");
		int a=sc.nextInt();
		int b=a;
		while(i<=b) {
			while(j<=a) {
				System.out.print(""+j);
				j++;
				System.out.print(" ");
			}
			i++;
			System.out.print("\n");
			a--;
			j=1;
		}
	}
}