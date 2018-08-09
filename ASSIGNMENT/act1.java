import java.util.Scanner;
public class act1 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int n[]=new int[15];
		System.out.print("Enter array numbers");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<n.length;i++)
		{
			n[i]=s.nextInt();
		}
		for(int i=0;i<n.length;i++)//printing array elements 
		{
			if(n[i]%3==0)
			{
				System.out.println("the number divisible by 3 is"+n[i]);
			}
			else
			{
				System.out.println("the number is not divisible by 3 is"+n[i]);
			}
		}
	}
}
