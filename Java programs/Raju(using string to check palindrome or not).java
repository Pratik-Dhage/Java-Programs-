class Raju   // to check given string is palindrome or not?
{ public static void main(String... args)
{String s=args[0]; // to store string during command line argument.

int i,j,l;  // i=to store string from index 0,j=to store string from index 0(from reverse),l=to store length of string.

System.out.println("Enter string:"+args[0]);
l=s.length();
for(i=0,j=l-1;i<l/2;i++,j--)
{ if(s.charAt(i)==s.charAt(j))
{ System.out.println("Palindrome"); }
else
{ System.out.println("Not palindrome"); }
}
}
}