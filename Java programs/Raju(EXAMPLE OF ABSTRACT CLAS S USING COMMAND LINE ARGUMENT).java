//EXAMPLE: RULE 6) OF ABSTRACT CLASS : NON ABSTRACT CLASS MUST IMPLEMENT ALL ABSTRACT METHODS OF ITS SUPER CLASS.


abstract class A
{ 
 abstract void add();
 abstract void mul();
}

abstract class B
{ 
 abstract void sub(); 
abstract void moddiv();
 abstract void div();
}

class Raju extends B
{
static int x,y,z,d,f,q,s;



{
  z=x+y; 
  d=x-y;
  f=x*y;
  q=x/y;
  s=x%y;

}
void add()
{
 
System.out.println(z);}      //OVERRIDE


 void sub()
{

 System.out.println(d); }   //OVERRIDE

void mul()
{
 
System.out.println(f);}      //OVERRIDE


void div()
{
 
System.out.println(q);}      //OVERRIDE

void moddiv()
{
 
System.out.println(s);}      //OVERRIDE



public static void main (String args[])
{  x=Integer.parseInt(args[0]);
y=Integer.parseInt(args[1]);

 Raju c=new Raju();  // OBJECT OF CLASS C


c.add();
c.sub();
c.mul();
c.div();
c.moddiv();
}
}