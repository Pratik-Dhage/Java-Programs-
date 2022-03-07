class Raju   // all String methods.
{ public static void main(String... args)
{String m;
boolean b=true;
String s=args[0]; // to store string during command line argument.
String n=args[1];  // to store string during command line argument.
m=s.concat(n);
System.out.println("Concat:"+m);
System.out.println(m.toUpperCase());
System.out.println(m.toLowerCase());
System.out.println(m.length());
System.out.println(m.substring(0,5));
System.out.println(m.replace('t','q'));
System.out.println(m.replaceFirst("to","qq"));
System.out.println(m.replaceAll("toppogoku","jj"));
System.out.println(m.charAt(1));
System.out.println(s.compareTo(n));
System.out.println(m.indexOf('t'));
System.out.println(m.lastIndexOf('t'));
System.out.println(s.equalsIgnoreCase(n));
System.out.println(s.equals(n));
System.out.println(m.trim());


}}