package class_practice;
import java.util.*;
public class Q1 
{
	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		int a;
		int b;
		int[] c = new int[100];
		System.out.println("Enter the size of the array:- ");
		a = ob.nextInt();
		for(b=0;b<a;b++)
		{
			c[b] = ob.nextInt();
		}
		int d = c[0];
		for(b=0;b<a;b++)
		{
			if(c[b] < d)
			{
				d = c[b];
			}
		}
		System.out.println("The smallest number in the array:- " + d);
		int e = c[0];
		for(b=0;b<a;b++)
		{
			if(c[b] > e)
			{
				e = c[b];
			}
		}
		System.out.println("The largest number in the array:- " + e);
		int f = e - d;
		System.out.println("The Difference:- " + f);
	}
}
