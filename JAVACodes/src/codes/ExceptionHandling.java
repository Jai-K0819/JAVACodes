package codes;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", "xyz", "456"};   //String Array containing valid and invalid numeric values
 
        for (int i = 0; i < s.length; i++)
        {
            try
            {
                int intValue = Integer.parseInt(s[i]);	//This statement may throw NumberFormatException
            }
            catch(NumberFormatException ex)
            {
            	System.out.println(ex);
                System.out.println("The thrown NumberFormatException will be caught here");
                ex.printStackTrace();
            }
            finally
            {
                System.out.println("This block is always executed");
            }
        }
    }
}