import java.io.*;  // to display length of string and concate.
class Raju
{ public static void main (String args[])throws IOException
{ String s1,s2,s3;
int l1,l2;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("enter first string:");
s1=br.readLine();    // first string stored in s1.
System.out.println("enter second string:");
s2=br.readLine();     // second string stored in s2.

l1=s1.length();   //method to store length of first string in l1. 
System.out.println("Length of first string:"+l1);

l2=s2.length();    //method to store length of second string in l2.
System.out.println("Length of second string:"+l2);

System.out.println(""+s1+" "+s2);     //to concate both strings.
}}