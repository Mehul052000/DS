package class_practice;
import java.util.*;
public class Q5 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int[][] e = new int[100][100];
		System.out.println("Enter the number of rows of the array:- ");
		a = ob.nextInt();
		System.out.println("Enter the number of columns of the array:- ");
		b = ob.nextInt();
		for(c=0;c<a;c++)
		{
			for(d=0;d<b;d++)
			{
				e[c][d] = ob.nextInt();
				if(e[c][d] > 99)
				{
					System.out.println("Sorry U had entered element greater than 99");
					System.exit(0);
				}
			}
		}
		System.out.println("Array U had entered:- ");
		for(c=0;c<a;c++)
		{
			for(d=0;d<b;d++)
			{
				System.out.print(e[c][d] + " ");
			}
			System.out.println();
		}
		System.out.println("Modified Array:- ");
		for(c=0;c<a;c++)
		{
			for(d=0;d<b;d++)
			{
				if((e[c][d]%2) != 0)
				{
					e[c][d] = e[c][d] * 2;
				}
				else
				{
					continue;
				}
			}
		}
		for(c=0;c<a;c++)
		{
			for(d=0;d<b;d++)
			{
				System.out.print(e[c][d] + " ");
			}
			System.out.println();
		}
	}
}