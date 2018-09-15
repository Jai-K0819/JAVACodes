package StringCodes;

/*
 
 Input : "i love my country"
 Output: "COUNTRY MY LOVE I"
 
 */

public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i love my country";
		String[] splited = s.split("\\s+");
		int len = splited.length;
		
		for(int i=len-1; i>=0; i--)
		{
			splited[i] = splited[i].toUpperCase();
			System.out.print(splited[i]+" ");
		}

	}

}
