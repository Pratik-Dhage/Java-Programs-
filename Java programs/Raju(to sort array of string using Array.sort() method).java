import java.util.*; //PROGRAM TO SORT ARRAYS OF TYPE STRING USING ARRAY METHOD Arrays.sort() OF ARRAY CLASS AVAILABLE IN util PACKAGE.
class Raju
{ public static void main(String[] args)
{ String book[]={"JAVA","Php","C","C++","SQL"};  // ARRAY DECLARED AS TYPE STRING AND INITIALIZED WITH VALUES JAVA,Php,C,C++,SQL.

System.out.println("Sorted Array:");
Arrays.sort(book);   //ARRAY METHOD TO SORT GIVEN ARRAYS IN ASCENDING ORDER.(uppercase considered first then lowercase).
for(String s:book)       //FOR EACH LOOP OR ENHANCED FOR LOOP INTRO. FROM JAVA5, for(Declaration:Expression).
System.out.println(s);

}
}