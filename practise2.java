package project;
import java.util.Scanner;
public class LowerToUpperCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character from (a-z) :");
		char lower = scanner.next().charAt(0);
		int upper = (int)lower;
		if(upper >= 97 && upper <= 123) {
		upper = upper - 32 ;
		char uppercase = (char)upper;	
		System.out.println("Upper case : " + uppercase);
	}
		else {
			lower = (char)upper;
			System.out.println(lower);
		}
		scanner.close();
	}
}
