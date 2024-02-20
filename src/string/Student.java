package string;

public class Student {
String name;
int age;
public Student(String name,int age)
{
	super();
	this.name=name;
	this.age=age;
}
public static void main(String[] args) {
	Student s=new Student("tina",23);
	System.out.println(s.toString());
	Student t=new Student("sam",27);
	System.out.println(t.toString());
}
}

