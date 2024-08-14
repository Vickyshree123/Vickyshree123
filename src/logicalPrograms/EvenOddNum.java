package logicalPrograms;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Given number is even Number");
		}
		else
		{
			System.out.println("Given number is odd Number");
		}
	}

}
