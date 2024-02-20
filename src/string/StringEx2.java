package string;
/* create a string array,store 4 string data
 * print all data by using for loop
 * ===>print only data which contains length greater than 5
 */
//import java.util.Scanner;
public class StringEx2 {

	public static void main(String[] args) {
	//Scanner s=new Scanner(System.in);
	String s[]= {"qspider","jspider","pyspider","btm"};
	System.out.println("all string data availale");
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
	System.out.println("//////////////////");
	System.out.println("printing element with length greater than s");
	for(int i=0;i<s.length;i++) {
		{
			if(s[i].length()>5)
			{
				System.out.println(s[i]);
			}
		}
	}
	}
}
		
	