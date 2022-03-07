import java.util.*; //PROGRAM TO SORT ARRAYS OF TYPE INTEGER USING ARRAY METHOD Arrays.sort()
class Raju
{ public static void main(String[] args)
{ int a[]={10,4,2,6,3,8,1};  // ARRAY DECLARED AS TYPE INTEGER AND INITIALIZED WITH VALUES 1,2,6,8,10.

System.out.println("Sorted Array:");
Arrays.sort(a);   //ARRAY METHOD TO SORT GIVEN ARRAYS IN ASCENDING ORDER.
for(int i:a)       //FOR EACH LOOP OR ENHANCED FOR LOOP INTRO. FROM JAVA5, for(Declaration:Expression).
System.out.println(i);

}
}