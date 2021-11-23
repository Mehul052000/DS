package class_practice;
import java.util.*;
public class Q3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int a;
		int b;
		int[] c = new int[5];
		int d = 0;
		int e = 0;
		int f = 0;
		System.out.println("Enter the size of the array:- ");
		a = ob.nextInt();
		for(b=0;b<a;b++)
		{
			c[b] = ob.nextInt();
		}
		for(b=0;b<a;b++)
		{
			d = d + c[b];
		}
		System.out.println("Sum of all elements of the array:- " + d);
		for(b=0;b<a;b++)
		{
			if((b % 2) == 0)
			{
				e = e + c[b];
			}
			else
			{
				f = f + c[b];
			}
		}
		System.out.println("Sum of elements at even positions:- " + e);
		System.out.println("Sum of elements at odd positions:- " + f);
	}
}