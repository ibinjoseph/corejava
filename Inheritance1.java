class Parent
{
	public void m2()
	{
		System.out.println("M2");
		
	}
	public void m4()
	{
		System.out.println("m4");
	}
}
class Child extends Parent
{
	public void m1()
	{
		System.out.println("m1");
		
	}
	public void m3()
	{
		System.out.println("m3");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p=new Child();
p.m2();
p.m4();
Child c=(Child)p;
c.m1();
	}

}
