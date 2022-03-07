import java.io.*;        // PROGRAM TO READ INPUT FROM USER AND PRINT ON SCREEN(INPUT OUTPUT STREAM)
class Raju
{ public static void main (String args[])throws IOException   //IOEXCEPTION IS A CHECKED EXCEPTION. IT IS COMPULSORY TO WRITE.
{int a;
InputStreamReader isr=new InputStreamReader(System.in);   //TAKE INPUT FROM USER THROUGH KEYBOARD.
BufferedReader br=new BufferedReader(isr);    //TO MAKE INPUT STREAM READER MORE EFFICIENT.
String s;        //TO STORE STRING VALUE.
System.out.println("Enter the Integer:");
s=br.readLine();       //TO READ INPUT AS STRING AND STORE IT IN VARIABLE s.
a=Integer.parseInt(s);  //TO CONVERT STRING TO INTEGER USING WRAPPER CLASS(Integer.parseInt).
System.out.println("Entered Integer:"+a);
}}
 