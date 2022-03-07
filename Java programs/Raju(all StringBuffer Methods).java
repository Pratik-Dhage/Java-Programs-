class Raju   // all StringBuffer methods.
{ public static void main(String... args)
{String m=args[0];
StringBuffer sb=new StringBuffer(m);
String n="hhhhhh";
System.out.println(sb.append(n));
System.out.println(sb.length());
System.out.println(sb.capacity());
System.out.println(sb.charAt(0));
System.out.println(sb.insert(0,"hello"));
System.out.println(sb.reverse());
System.out.println(sb.delete(0,4));
System.out.println(sb.deleteCharAt(0));
System.out.println(sb.replace(0,4,"kkkkk"));
System.out.println(sb.substring(0,3));






}}