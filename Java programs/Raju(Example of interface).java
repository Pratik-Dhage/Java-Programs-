//INTERFACE (INTERFACE IS A CLASS THAT CONTAINS ALL ABSTRACT METHODS THAT ARE PUBLIC)

import java.util.*;
 interface I
{  
int x=3,y=4,f=x+y,z=x-y; 

void add();   //implicitly public-abstract
  void sub();   //implicitly public-abstract
}

class A implements I
{ public void add() { System.out.println(f); }   //OVERRIDE AND RULE 4)
public void sub() { System.out.println(z); }     // OVERRIDE AND RULE 4)
 }

class B implements I
{ public void add() { System.out.println(f); }   //OVERRIDE AND RULE 4)
public void sub() { System.out.println(z); }     // OVERRIDE AND RULE 4)
 }

class Raju 
{  
 public static void main (String args[])
{


 

 I i=new A();          //POLYMORPHIC REFERENCE (reference superclass ka aur object subclass ka)
  i.add();
  i.sub();

 i=new B();          //POLYMORPHIC REFERENCE (reference superclass ka aur object subclass ka)
  i.add();
  i.sub();


}}


/* RULES FOR INTERFACE:
1)ALL METHODS IN INTERFACE ARE IMPLICITLY PUBLIC AND ABSTRACT.

2)METHODS INSIDE INTERFACE CANNOT BE PRIVATE,PROTECTED,STATIC,FINAL BUT ALL VARIABLES DECLARED IN INTERFACE ARE PUBLIC-STATIC-FINAL .

3)INTERFACE DECLARES ONLY CONSTANTS AND NOT INSTANCE VARIABLES.

4)WHEN IMPLEMENTING(USING) INTERFACE THE METHOD OF INTERFAcE SHOULD BE PUBLIC.  */