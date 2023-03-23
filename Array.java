package cycle2;

import java.util.Scanner;

public class Array{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, x, flag = 0, i=0,el;

		Scanner s = new Scanner(System.in);

		System.out.print("Enter no. of elements you want in array:");

		n = s.nextInt();

		int a[] = new int[n];

		System.out.println("Enter all the elements:");

		for (i = 0; i < n; i++)

		{

			a[i] = s.nextInt();

		}
		int sum=0;
		for(int el1:a)
		{
			sum=sum+el1;
		}
		
		System.out.println("sum is:"+sum);
	
	}
}
