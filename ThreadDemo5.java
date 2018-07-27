class AlphaThread2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char c='a';c<'g';c++)
			
		{
			System.out.println(c);
		}
	}
	
}
class NumberThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	
}
public class ThreadDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Thread at=new Thread(new AlphaThread2());
		Thread bt=new Thread(new NumberThread());
		
		at.start();
		bt.start();
		
		

	}

}
