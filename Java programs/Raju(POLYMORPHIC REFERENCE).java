// POLYMORPHIC REFERENCE

class A                  //SUPERCLASS
{ int d=10;
void show()
{ System.out.println("A="+d);}
}

class B extends A            //SUBCLASS
 { int d=20;
void show()
{ System.out.println("B="+d);}
}

class Raju          //MAINCLASS
{ public static void main (String[] args)
{ A a=new B();    //POLYMORPHIC REFERENCE(REFERENCE SUPER KA AUR OBJECT SUB KA) & DATA OVERRIDDEN SUPER KA AUR METHOD OVERRIDDEN SUB KA 
System.out.println("Data1:"+a.d);
System.out.println("Data2:"+a.d);
a.show();
a.show();                                                                                  
}}



/*SUPERCLASS                                                SUPERCLASS
    !                                                           ^
    !                                                           !
    !SPECIALIZATION(DOWNCASTING)                                !GENERALIZATION(UPCASTING)
    !                                                           !
    V                                                           !
  SUBCLASS                                                   SUBLASS          */
  