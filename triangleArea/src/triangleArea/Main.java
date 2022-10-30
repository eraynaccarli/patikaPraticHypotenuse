package triangleArea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int  a,b;
		double c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first edge: ");
		a = sc.nextInt();
		System.out.println("Enter second edge: ");
		b = sc.nextInt();
		
		c = Math.sqrt((a*a) + (b*b));
		System.out.println("Hypotenuse: " + c);

	}

}
