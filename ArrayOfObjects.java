class Product
{
	String name;
	double price;
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p1=new Product("laptop", 1000.0);
Product p2=new Product("lap", 100.0);
Product p3=new Product("l", 10.0);

	}

}
