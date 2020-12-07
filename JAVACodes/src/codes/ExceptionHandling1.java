package codes;

public class ExceptionHandling1
{
    public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        }
 
        catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
        }
 
        catch(NumberFormatException ex)
        {
            //Compile time error
            //This block becomes unreachable as
            //exception is already handled by above catch block
        }
    }
}