package section1;

import java.util.Scanner;

public class areaRec {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double base;
		double height;
		
		//input
		System.out.print("Enter base: ");
		base = input.nextDouble();
				
		System.out.print("Enter height: ");
		height = input.nextDouble();
				
		//calculate
		double area = base * height;
		
		//output
		System.out.print("Area of Rectangle = " + area);

	}

}
