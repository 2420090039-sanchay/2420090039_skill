package OOPS;
import java.util.Scanner;

public class array_1D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        int sum = 0;
        double average;

        System.out.println("Enter the values :");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / size;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}