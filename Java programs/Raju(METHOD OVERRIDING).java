//PROGRAM OF METHOD OVERRIDING(rewriting or reimplementing method of superclass in subcalss)

class Bank  //SUPERCLASS
{ int getRateOfInterest()
{ return 0;} } 

class ICICI extends Bank   //SUBCLASS OF BANK
{ int getRateOfInterest()
{ return 1;} }

class SBI extends Bank          //SUBCLASS OF BANK
{ int getRateOfInterest()
{ return 2;} }

class BOI extends Bank              //SUBCLASS OF BANK
{ int getRateOfInterest()
{ return 3;} }

class Raju
{ public static void main (String [] ary)
{ ICICI i=new ICICI(); //Object Of ICICI
  SBI s=new SBI();   // Object of SBI
  BOI b=new BOI();           //Object of BOI

System.out.println(i.getRateOfInterest());
System.out.println(s.getRateOfInterest());
System.out.println(b.getRateOfInterest());
}
}