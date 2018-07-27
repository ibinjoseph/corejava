class Restuarent
{
	public synchronized void takeLunch(String name)
	{
		System.out.println("Have Food "+name);	
	}
}
class EatThread extends Thread
{
	Restuarent r;
	 String name;

public EatThread(Restuarent r, String name)
{
	super();
	this.r=r;
	this.name=name;
	
}
public void run()
{
	r.takeLunch(name);
}
}
public class SynchronizedDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Restuarent r = new Restuarent();
EatThread E1=new EatThread(r,"ibin");
EatThread E2=new EatThread(r,"abhi");
E1.start();
E2.start();

	}

}
