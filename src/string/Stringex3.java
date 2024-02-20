package string;

public class Stringex3 {
public static void main(String[] args) {
	String s="karnataka";
	int len=s.length();
	System.out.println("length of a given string  literalsis"+len);
	char c=s.charAt(0);
	System.out.println("character at index is "+ c);
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println("index of r is "+s.indexOf('r'));
	System.out.println("index of a is "+s.indexOf('a'));
	System.out.println("last index of a is "+s.lastIndexOf('a'));
	
			
}
}
