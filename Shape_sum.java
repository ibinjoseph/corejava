class circle
{
	double radius;
	
}
class rect{
	double l,b;
}
class square{
	double h;
	
}
class shape
{
	public double calculateArea(circle c)
	{
		return c.radius*3.14;
	}
	public double calculateArea(rect r)
	{
		return r.b*r.l;
	}
	public double calculateArea(square s)
	{
		return s.h*s.h;
	}
}
public class Shape_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
circle c =new circle();
c.radius=10;
rect r=new rect();
r.b=10;
r.l=10;
square s = new square();
s.h=5;
shape h=new shape();

System.out.println(h.calculateArea(c));

}
	}


