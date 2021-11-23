package class_practice;
import java.util.*;
public class Q8 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int a;
		int b;
		int temp = 0;
		int[] c = new int[100];
		System.out.println("Enter the size of the array:- ");
		a = ob.nextInt();
		for(b=0;b<a;b++)
		{
			c[b] = ob.nextInt();
		}
		System.out.println("Array in ascending order:- ");
		for(b = 0; b < a; b++)
		{
			for(int d = b+1; d < a; d++)
			{
				if(c[b] > c[d])
				{
					temp = c[b];
					c[b] = c[d];
					c[d] = temp;
				}
			}
		}
		for(b=0;b<a;b++)
		{
			System.out.print(c[b] + " ");
		}
		int e = ((a+1)/2);
//		for(b=0;b<a;b++)
//		{
			System.out.println("\n" + c[e-1]);
//		}
	}
}