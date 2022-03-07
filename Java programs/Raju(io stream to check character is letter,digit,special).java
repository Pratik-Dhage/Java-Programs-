import java.io.*;
class Pratik
{public static void main (String[] args)throws IOException
{char a;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
 String s;

{System.out.println("Enter a character:");}
s=br.readLine();     //TO TAKE INPUT FROM USER AND STORE IT IN STRING s. 
a=s.charAt(0);            // TO STORE STRING s AS CHARACTER IN CHARACTER a.

if(Character.isDigit(a))
{System.out.println("is digit");}
else if(Character.isLetter(a))
{System.out.println("is letter");}

else
{System.out.println("is Special");}

}}
















