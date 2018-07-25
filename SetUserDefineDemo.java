import java.util.HashSet;

class Mobile
{
	String mobileName;
	double price;
	public Mobile(String mobileName, double price) {
		super();
		this.mobileName = mobileName;
		this.price = price;
	}
	
}
public class SetUserDefineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile m1=new Mobile("Samsung",2500.00);
Mobile m2=new Mobile("Samsung",2500.00);
HashSet hs=new HashSet();
System.out.println(hs.add(m1));
System.out.println(hs.add(m2));
System.out.println(hs);

	}

}
