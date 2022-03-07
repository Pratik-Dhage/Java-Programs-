import java.io.*; //TO FIND LARGEST OF GIVEN n NUMBERS USING ARRAY.
class Raju
{ public static void main(String[] args)throws IOException
{ int a[],i,n,max;
InputStreamReader isr=new InputStreamReader(System.in);  //TO TAKE INPUT FROM USER THROUGH KEYBOARD.
BufferedReader br=new BufferedReader(isr);  //TO MAKE INPUT STREAM READER MORE EFFICIENT.
String s;

System.out.println("Enter size of array");
s=br.readLine();
n=Integer.parseInt(s); // WRAPPER CLASS THAT CONVERTS STRING s TO INTEGER AND STORE IN n.
a=new int[n];

for(i=0;i<a.length;i++)
{ System.out.println("Enter the element:"+(i+1));
s=br.readLine();
a[i]=Integer.parseInt(s); //TO CONVERT STRING TO INTEGER AND STORE IN ARRAY a[].
}

max=a[0];
for(i=1;i<a.length;i++)
{ 
if(a[i]>max)
max=a[i];
}
System.out.println("MAX Number is:"+max);

}
}                                       