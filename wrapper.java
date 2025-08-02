package OOPS;

public class wrapper {
	public static void main(String args[]) {
		Integer a=564;
		Boolean b=true;
		Double d=9.876d;
		int c=10;
		//Here the toString is used to convert the wrapper class into a string and we are finding its length.
		//But we can't do the same to a primitive datatype. It will show an error.
		System.out.println(a.toString().length());
		System.out.println(d.toString().length());
	}
}
