package PatternCodes;

public class Patterns {
	
	/*
	 
	 Output:
	 
	 *       *
	 **     **
	 ***   ***
	 **** ****
	 *********
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, t = 0;
		int a = 2*n - 3;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int k=1; k<=a; k++)
			{
				System.out.print(" ");
			}
			if(i==n)
				t=i-1;
			else
				t=i;
			for(int x=1; x<=t; x++)
			{
				System.out.print("*");
			}
			System.out.println();
			a=a-2;
		}
		
		
}
}
