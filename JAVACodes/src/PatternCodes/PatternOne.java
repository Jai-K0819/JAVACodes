package PatternCodes;

public class PatternOne {
	/**
	 * @param args
	 */
	
/*

Output:

    1
   22
  333
 4444
55555
	 
 */
	public static void main(String args[])
	{
		int n = 5;
		int sp = n-1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j<=sp)
					System.out.print(" ");
				else
					System.out.print(""+i);
			}
			sp = sp-1;
			System.out.println();
		}
	}
}
