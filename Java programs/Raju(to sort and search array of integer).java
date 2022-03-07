import java.util.*; //PROGRAM TO SORT ARRAYS OF TYPE INTEGER USING ARRAY METHOD Arrays.sort() AND SEARCH ARRAY USING Arrays.binarySearch() OF ARRAY CLASS AVAILABLE IN                                                                                                                                                         util PACKAGE.
class Raju
{ public static void main(String[] args)
{ int i[]={10,0,3,9,6};  // ARRAY DECLARED AS TYPE INTEGER AND INITIALIZED WITH VALUES 10,0,3,9,6.

System.out.println("Sorted Array:");
Arrays.sort(i);   //ARRAY METHOD TO SORT GIVEN ARRAYS IN ASCENDING ORDER.
for(int n:i)       //FOR EACH LOOP OR ENHANCED FOR LOOP INTRO. FROM JAVA5, for(Declaration:Expression).
System.out.println(n);

System.out.println("Search Array 9:"+Arrays.binarySearch(i,9)); // WHEN SEARCHING FOR ARRAY( Arrays.binarySearch() ) COMPULSORY SORT FIRST THEN SEARCH.


}
}