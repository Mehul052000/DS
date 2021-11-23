package class_practice;
import java.util.*;
public class Q7 
{
	public static void swapp(int d[] ,int e)
	{
		int f;
		for(f=0;f<e;f=f+2)
		{
			int temp = d[f];
			d[f] = d[f+1];
			d[f+1] = temp;
		}
		for(f=0;f<e;f++)
		{
			System.out.print(d[f] + " ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
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
		System.out.println("Array before Swapping:- ");
		for(b=0;b<a;b++)
		{
			System.out.print(c[b] + " ");
		}
		System.out.print("\n");
		System.out.println("Array after Swapping:- ");
		swapp(c,a);
	}
}