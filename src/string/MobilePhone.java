package string;
/* create a class mobilephone
with variables
brand, price,color
===>create constructor with all arguments
===>create a method display
===>create an array of 5 mobile phone objects
====>print only details of mobile phone with brand constant'a'*/

public class MobilePhone {
String brand;
long price;
String color;
  public MobilePhone(String brand,long price,String color)
{
	  super();
	this.brand=brand;
	this.price=price;
	this.color=color;
	
}
 /* public String toString()
  {
	  return brand+" "+price+" "+color;
  }*/
  public void display()
  {
	  System.out.println("mobile phone available");
	  System.out.println("////////////");
	  System.out.println("brand:"+brand);
	  System.out.println("price:"+price);
	  System.out.println("color:"+color);
  }
  public static void main(String[] args) {
	  MobilePhone ob1=new MobilePhone("samsung ",40000l,"white");
	  MobilePhone ob2=new MobilePhone("oppo",20000l,"black");
	  MobilePhone ob3=new MobilePhone("oneplus",230988l,"grey");
	  MobilePhone ob4=new MobilePhone("nokia",450000l,"red");
	  MobilePhone ob5=new MobilePhone("Apple",150000l,"white");
	  
	  MobilePhone m[]= {ob1,ob2,ob3,ob4,ob5};//adding 5 mobile object into array
	  
	  System.out.println("printing details where brand contains 'a'");
	  for(int i=0;i<5;i++)
	  {
		  if(m[i].brand.indexOf('a')!=-1)//checking 'a' is present or not in brand
		  {
			 m[i].display();//printing details only if brand contains 'a'
		  
		  }
	  }
	  System.out.println("printing detials of mobike with price greater than 20000k");
	  for(int i=0;i<m.length;i++)
	  {
		  if(m[i].price>20000)
		  {
			/*System.out.println(m[i]);//*/ m[i].display();
		  }
	  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

