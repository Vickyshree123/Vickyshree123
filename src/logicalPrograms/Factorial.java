package logicalPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//4!=4*3*2*1;=24
		//5!=5*4*3*2*1;=120
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your Number");
		int num = sc.nextInt();
		int factorial = 1;
		
		
		for(int i=num;i>=1;i--)//5,4,3
		{
			factorial=i*factorial;
			//5=5*1
			//20=4*5
			//60=3*20
		}
		//System.out.println(factorial);
		
		System.out.println("Factorial of "+ num +" is " + factorial);
		
	}

}
