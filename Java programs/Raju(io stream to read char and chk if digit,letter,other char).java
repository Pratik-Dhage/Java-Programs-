import java.io.*;        // PROGRAM TO READ CHARACTER FROM USER AND CHECK WHETHER IT IS LETTER/DIGIT/OTHER CHARACTER.
class Pratik7
{ public static void main (String args[])throws IOException   //IOEXCEPTION IS A CHECKED EXCEPTION. IT IS COMPULSORY TO WRITE.

{char a;
String s;
InputStreamReader isr=new InputStreamReader(System.in);   //TAKE INPUT FROM USER THROUGH KEYBOARD.
BufferedReader br=new BufferedReader(isr);    //TO MAKE INPUT STREAM READER MORE EFFICIENT.
       
{
System.out.println("Enter the Character:");
}
s=br.readLine(); // Storing value in String s

a=s.charAt(0);  //CONVERT STRING s TO CHARACTER AND STORE IN CHAR a. 

if(Character.isLetter(a))   //TO CHECK WHETHER INPUT CHARACTER IS LETTER.
{
System.out.println("It is Letter");

}else if(Character.isDigit(a))

System.out.println("It is Digit");
else
System.out.println("It is other character");

}
}
 