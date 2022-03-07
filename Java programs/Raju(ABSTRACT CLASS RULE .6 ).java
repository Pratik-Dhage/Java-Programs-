// RULE 6) OF ABSTRACT CLASS : NON ABSTRACT CLASS MUST IMPLEMENT ALL ABSTRACT METHODS OF ITS SUPER CLASS.


abstract class A
{ abstract void showa(); }

abstract class B
{ abstract void showb(); }

class C extends B
{ 
void showa()
{ System.out.println("SHOWA"); }    //OVERRIDE


 void showb()
{ System.out.println("SHOWB"); }   //OVERRIDE

public static void main (String args[])
{ C c=new C();  // OBJECT OF CLASS C
c.showa();
c.showb();
}
}