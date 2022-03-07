// PROGRAM OF INHERITANCE , CHECK EXAMPLE OF BOOk


class Person       // SUPERCLASS=Person
{ private int id;
private String name;
public int getId()
{ return id; }
public void setId(int id)
{ this.id=id;   }                                                                                                 

public String getName()
{ return name; }
public void setName(String name)
{ this.name=name;   }
}

class Teacher extends Person     // SUBCLASS=Teacher
{ private int age;
private String address;
public int getAge()
{ return age; }
public void setAge(int age)
{ this.age=age;   }

public String getAddress()
{ return address; }
public void setAddress(String address)
{ this.address=address;   }
}


class Raju                     // MAIN CLASS
{ public static void main(String[] args)
{ Person r=new Person();                                      // Create Object of SUPERCLASS 
  Teacher t=new Teacher();                       //Create Object of SUBCLASS
r.setId(5);
r.setName("Top");
t.setAge(50);
t.setAddress("MUMBAI");
System.out.println("ID:"+r.getId());
System.out.println("NAME:"+r.getName());
System.out.println("AGE:"+t.getAge());
System.out.println("ADDRESS:"+t.getAddress());

}
}