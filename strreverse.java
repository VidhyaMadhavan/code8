import java.io.*;
import java.util.*;
import java.lang.*;
class strreverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str,revstr=" ";
System.out.println("Enter string:");
str=sc.nextLine();
int len=str.length();
for(int i=len;i>0;i--)
{
revstr +=str.charAt(i-1);
}
System.out.println(revstr);
}
}
