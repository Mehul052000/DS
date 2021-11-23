package class_practice;
import java.util.*;
public class Q2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int a;
		int b;
		int[] c = new int[10];
		int[] d = new int[10];
		System.out.println("Enter the size of array:- ");
		a = ob.nextInt();
		for(b=0;b<a;b++)
		{
			c[b] = ob.nextInt();
		}
		System.out.println("The Element on Even Index of the array:- ");
		for(b=0;b<a;b++)
		{
			if((b % 2) == 0)
			{
				System.out.print(c[b] + " ");
			}
			else
			{
				continue;
			}
		}
		System.out.print("\n");
		System.out.println("The Element on Odd Index of the array:- ");
		for(b=0;b<a;b++)
		{
			if((b % 2) != 0)
			{
				System.out.print(c[b] + " ");
			}
			else
			{
				continue;
			}
		}
		System.out.print("\n");
		System.out.println("Reverse of the array:- ");
		for(b=a-1;b>=0;b--)
		{
			System.out.print(c[b] + " ");
		}
		System.out.print("\n");
		System.out.println("First Element:- " + c[0]);
		System.out.println("Last Element:- " + c[a-1]);
	}
}