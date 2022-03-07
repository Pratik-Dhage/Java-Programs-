class Top // USING StringBuffer CHECK PALINDROME OR NOT.
{ public static void main (String[] args)
{String s=args[0];
StringBuffer sb=new StringBuffer(s);
sb.reverse();
if(s.equals(sb.toString()))
System.out.println("palindrome");
else 
System.out.println("Not palindrome");
}}