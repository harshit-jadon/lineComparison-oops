package com.bridgelabz.linecomparison;
import java.util.Scanner;
public class LineGeometryOops {
	int x1 = 0;
	int x2 = 0;
	int y1 = 0;
	int y2 = 0;
	public double calculateLength() {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	public static void main(String args[]) {
	
		Scanner scanner = new Scanner(System.in);
	
		
		LineGeometryOops l1 = new LineGeometryOops();
		System.out.println("Enter the value of x1 and y1 of Line 1");
		l1.x1 = scanner.nextInt();
		l1.y1 = scanner.nextInt();
		System.out.println("Enter the value of x2 and y2 of Line 2");
		l1.x2 = scanner.nextInt();
		l1.y2 = scanner.nextInt();
		double LenghtOfLine1 =l1.calculateLength();
		System.out.println("Length of Line1 = " + LenghtOfLine1 );
		
		LineGeometryOops l2 = new LineGeometryOops();
		System.out.println("Enter the value of x1 and y1 of Line2");
		l2.x1 = scanner.nextInt();
		l2.y1 = scanner.nextInt();
		System.out.println("Enter the value of x2 and y2 of Line2");
		l2.x2 = scanner.nextInt();
		l2.y2 = scanner.nextInt();
	     double LenghtOfLine2 = l2.calculateLength();
	     System.out.println("Length of Line2 = " + LenghtOfLine2 );
		
		String LL1 = LenghtOfLine1 + "";
		String LL2 = LenghtOfLine2 + "";
		if(LL1.equals(LL2))
			System.out.println("Both lines are equal.");
		else
			System.out.println("Lines are not equal.");
		
		int compare = LL1.compareTo(LL2);
		
		if(compare == 0.0)
			System.out.println("Both Lines are equal");
		else if (compare < 0.0)
			System.out.println(" Length of Line1 is Smaller");
		else
			System.out.println("Length of Line2 is Smaller ");
		
	}
}






