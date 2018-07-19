class cot{
	double price;
}
class chair{
	double price;
	
}
class diningTable{
	double price;
}
class Furniture
{
public double calcDiscount(cot c)
{
	return c.price*0.1;
}
public double calcDiscount(chair cc)
{
	return cc.price*0.15;
}
public double calcDiscount(diningTable dd)
{
	return dd.price*0.1;
}
}
public class Method_overloading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
cot c=new cot();
c.price=25;
chair cc=new chair();
cc.price=66;
diningTable dd=new diningTable();
dd.price=88;
Furniture f=new Furniture();
System.out.println(f.calcDiscount(cc));
System.out.println(f.calcDiscount(c));




	}

}
