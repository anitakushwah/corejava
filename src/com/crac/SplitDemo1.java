package com.crac;

public class SplitDemo1
{
public static void reverse()
{
    String str="Kittu";
	String rev=" ";
	  for(int i=str.length()-1; i>=0; i--)
	  {
	  rev=rev+str.charAt(i);
	  }
	  
System.out.println(rev);
}
public static void main(String[]args)
{
   SplitDemo1.reverse();
}
}

