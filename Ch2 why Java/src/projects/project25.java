package projects;

import java.util.Scanner;

public class project25 {

	public static void main(String[] args) {

		Scanner rd = new Scanner(System.in);
		
		//input
		System.out.println("Enter object's mass: ");
		double mass = rd.nextDouble();
		
		System.out.println("Enter velocity: ");
		double vel = rd.nextDouble();
		
		//calculate
		double momentum = mass * vel;
		
		//output
		System.out.println("Momentum = " + momentum);
		
		
		
	}

}
