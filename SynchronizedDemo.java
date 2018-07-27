class Greeting
{
	public void sayHello(String name)
	{
		System.out.println("!");
		System.out.println(name);
		System.out.println("!");
		
	}
}
class GreetingThread extends Thread
{
	String name;
	Greeting greeting;
	public GreetingThread(String name, Greeting greeting) {
		super();
		this.name = name;
		this.greeting = greeting;
	}
	public void run()
	{
		greeting.sayHello(this.name);
	}
	
}
public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Greeting g=new Greeting();
GreetingThread gt1=new GreetingThread("ibin", g);
GreetingThread gt2=new GreetingThread("abhi", g);
gt1.start();
gt2.start();



	}

}
