package project;
import java.util.Scanner;
public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value for A : ");
		int a = scanner.nextInt();
		System.out.print("Enter a value for B : ");
		int b = scanner.nextInt();
		System.out.println("A = "+ a + " , B = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping....");
		System.out.println("A = "+ a + " , B = " + b);
		scanner.close();
	}
}
