package twointegers;
import java.util.Scanner;
public class twointegersrunnter {
	public static void main(String[] args)
	{ 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();
		System.out.print("Enter another number: ");
		int num2 = input.nextInt();
		twointegers twointegers = new twointegers(num1, num2);
		String arithmetic = twointegers.arithmetic();
		int larger = twointegers.larger();
		boolean isEven = twointegers.isEven();
		boolean isMultiple = twointegers.isMultiple();
		System.out.println(arithmetic);
		System.out.println(larger + " is larger");
		System.out.println("Is " + num1 + " a multiple of " + num2 + "?: " + isMultiple);
	}
	

}
