//ABSTRACT CLASS

abstract class A     // abstract SUPERCLASS  
{ 
void fy()      // CONCRETE METHOD(METHOD THAT CONTAINS BODY{} OR STATEMENT(s) IN IT.)                         
  
{ System.out.println("FIRST YEAR"); }
 abstract void sy();       // ABSTRACT METHOD(METHOD THAT does not CONTAINS BODY{} OR STATEMENT(s) IN IT and is with ; at end)
 abstract void ty();    //ABSTRACT METHOD

void be()   // CONCRETE METHOD
{ System.out.println("LAST  YEAR"); }
}

class B extends A       //SUBCLASS
{ void sy()
{ System.out.println("SECOND YEAR"); }   //OVERRIDE(CHANGING FUNCTIONALITY) 
 
void ty()
{ System.out.println("THIRD YEAR"); }    //OVERRIDE(CHANGING FUNCTIONALITY)
}
 

class Raju
{ public static void main (String args[]) 
{ B b=new B();     //NORMAL REFERENCE
b.fy();
b.sy();
b.ty();
b.be();
}
}


/* RULES FOR ABSTRACT CLASS
1) CANNOT DECLARE ABSTRACT METHOD WITHOUT ABSTRACT CLASS.

2)CAN DECLARE ABSTRACT CLASS WITHOUT ABSTRACT METHOD.

3)METHOD CANNOT BE FINAL ABSTRACT AT SAME TIME.  ( final abstract void show();  X X )

4)METHOD CANNOT BE PRIVATE ABSTRACT AT SAME TIME.  ( private abstract void show();  X X )

5)IF SUBCLASS IS ABSTRACT THEN IT IS NOT COMPULSORY TO IMPLEMENT ALL ABSTRACT METHODS.

6)A NON ABSTRACT CLASS MUST IMPLEMENT ALL ABSTRACT METHODS OF ITS SUPERCLASS.      */ 