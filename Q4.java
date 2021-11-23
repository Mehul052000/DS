package class_practice;
import java.util.*;
public class Q4 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int a;
		int b;
		int[] c = new int[100];
		int d = 0;
		int e;
		System.out.println("Enter the size of the array:- ");
		a = ob.nextInt();
		for(b=0;b<a;b++)
		{
			c[b] = ob.nextInt();
		}
		System.out.println("Enter the number u want to search:- ");
		e = ob.nextInt();
		for(b=0;b<a;b++)
		{
			if(c[b] == e)
			{
				d = d + 1;
			}
		}
		if(d == 0)
		{
			System.out.println("Not Found");
		}
		else
		{
			System.out.println("Found " + d + " times");
		}
	}
}