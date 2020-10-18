package fibo;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		int a=0,b=1,c,n,i;
		System.out.println("Enter the size of Fibonacci series");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
	}

}
