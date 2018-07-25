interface Comparison
{
	public void whichIsGreater(Object O1,Object O2);
}
class Employee1 implements Comparison
{
	String empid;
	Double salary;

	public Employee1(String empid, Double salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}

	@Override
	public void whichIsGreater(Object O1, Object O2) {
		// TODO Auto-generated method stub
		Employee1 e1=(Employee1)O1;
		Employee1 e2=(Employee1)O2;
		if(e1.salary>e2.salary)
			System.out.println(e1.empid+"is Greater");
		else
			System.out.println(e2.empid+"is Greater");
	}
}
class Apple implements Comparison
{
String source;
double price;
public Apple(String source,double price)
{
	super();
	this.source=source;
	this.price=price;
	
}
	@Override
	public void whichIsGreater(Object O1, Object O2) {
		// TODO Auto-generated method stub
		Apple a1=(Apple)O1;
		Apple a2=(Apple)O2;
		if(a1.price>a2.price)
			System.out.println(a1.source+"is greater");
		else
			System.out.println(a2.source+"is Greater");
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 e1=new Employee1("emp1",25000.0);
Employee1 e2=new Employee1("emp2",35000.0);
Employee1 e3=new Employee1("emp3",44000.0);
e3.whichIsGreater(e1, e2);

Apple b=new Apple("ibin",8700.9);
Apple c=new Apple("Konatplace",5600.8);
c.whichIsGreater(b, c);



	}

}
