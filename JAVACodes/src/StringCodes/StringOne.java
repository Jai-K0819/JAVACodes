package StringCodes;

import java.io.*;

/*

Input: "i love my country"
Output: "I LovE MY CountrY"

 */

public class StringOne {
	public static void main(String args[])
	{
	String s = "i love my country";
	String[] splited = s.split("\\s+");
	int len = splited.length;
	for (int i=0; i<len; i++)
	{
		int l = splited[i].length();
		char first = Character.toUpperCase(splited[i].charAt(0));
		if(l==1)
			splited[i] = Character.toString(first);
		else if(l==2)
		{
			char last = Character.toUpperCase(splited[i].charAt(1));
			splited[i] = Character.toString(first) + Character.toString(last);
		}
		else
		{
			char last = Character.toUpperCase(splited[i].charAt(l-1));
			splited[i] = first + splited[i].substring(1, l-1) + last;
		}
	}
	for (int i=0; i<len; i++)
	{
		System.out.print(splited[i]+ " ");
	}
	}
}
