abstract class person
{
	public boolean DoesHeBreathe()
	{
		System.out.println("Every person breath");   
		return true;
	}
	public boolean doesHeSleep()
	{
		System.out.println("Every person sleep");
		return true;
	}
	public abstract boolean doesHeDrive();

}
abstract class Employee6 extends person{
	public abstract boolean doesHeDrive();
	
}
class Driver1 extends Employee6
{

	@Override
	public boolean doesHeDrive() {
		// TODO Auto-generated method stub
		System.out.println("Every Driver Drives Car");
		return true;
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Driver1 d=new Driver1();
System.out.println("Does He Breath?"+d.DoesHeBreathe());
System.out.println("Does He sleep?"+d.doesHeSleep());
System.out.println("Does he Drive?"+d.doesHeDrive());

	}

}
