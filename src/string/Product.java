package string;
/*int pid,float price*/
public class Product {
int pid;
float price;
public Product(int pid,float price) {
	super();
	this.pid=pid;
	this.price=price;
}

public String toString()
{
	return "product id is "+ pid+ " product price is " + price;
}
public static void main(String[] args) {
	Product p1=new Product(25453466,3000.5f);
	Product p2=new Product(26242453,7000.6f);
	System.out.println(p1);
	System.out.println(p2);

}
}

