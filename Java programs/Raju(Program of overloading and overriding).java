// 1 Program of Overloading(ADDING FUNCTIONALITY) and Overriding(CHANGING FUNCTIONALITY)

class A  // Superclass
{ void calculate(int x)     // FUNCTIONALITY
{ System.out.println("SQUARE:"+x*x); }}

class B extends A // Subclass
{ void calculate(int x)    //OVERLOADING
{ System.out.println("CUBE:"+x*x*x);   
}

void calculate(float x)  //OVERRIDING
{ double t=Math.sqrt(x);   //float can be viewed as double but not vice versa.
 System.out.println("SQUARE ROOT:"+t);  }
}

class Raju
{ public static void main(String[] args)
{ A a=new A();
a.calculate(5);
B b=new B();
b.calculate(6);
b.calculate(6f);  }
}

