class Number1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
	}
}
class Alphathread extends Thread
{
	public void run() {
		for(char c='A';c<='E';c++)
		{
			System.out.println(c);
		}
	}
	
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Number1 nt=new Number1();
nt.start();
nt.setName("NumberThread");//invoke the start  method
System.out.println(Thread.currentThread().getName());
Alphathread a=new Alphathread();
a.start();

	}

}
