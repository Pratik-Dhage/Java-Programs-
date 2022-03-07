import java.io.*;        // PROGRAM TO READ INPUT FROM USER AND CHECK WHETHER IT IS EVEN OR ODD.
class Raju
{ public static void main (String args[])throws IOException   //IOEXCEPTION IS A CHECKED EXCEPTION. IT IS COMPULSORY TO WRITE.

{int a;

InputStreamReader isr=new InputStreamReader(System.in);   //TAKE INPUT FROM USER THROUGH KEYBOARD.
BufferedReader br=new BufferedReader(isr);    //TO MAKE INPUT STREAM READER MORE EFFICIENT.
String s;        //TO STORE STRING VALUE.
{
System.out.println("Enter the Integer:");
}
s=br.readLine(); //TO READ INPUT AS STRING AND STORE IT IN VARIABLE s.
a=Integer.parseInt(s);  //TO CONVERT STRING TO INTEGER USING WRAPPER CLASS(Integer.parseInt).
if(a%2==0)   //TO CHECK WHETHER INPUT INTEGER IS DIVISIBLE BY 2 AND REMAINDER IS 0.
{
System.out.println("It is EVEN");

}else if(a%2!=0)

System.out.println("It is ODD");

}
}
 