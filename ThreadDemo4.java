class FirstThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
	}
}
class SecondThread extends Thread
{
	public void run() {
		for(int j=15;j<21;j++)
		{
			System.out.println(j);
		}
	}
	
}
public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstThread f=new FirstThread();
SecondThread s=new SecondThread();
f.start();
s.start();


System.out.println(Thread.currentThread().getName());

	}

}
