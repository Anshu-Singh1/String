package string;

public class Student2 {
String  name;
int age;
public Student2(String name,int age)
{
	super();
	
	this.name=name;
	this.age=age;
}
public static void main(String[] args) {
	Student2 s=new Student2("Tina ",23);
	System.out.println(s);
	Student2 t=new Student2("Sam ",27);
	System.out.println(t);
}
	public String toString()
	{
		return "name is "+name+ "age is "+age;
	
}
}

