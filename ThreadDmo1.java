class Number extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
	}
}
public class ThreadDmo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Number nt=new Number();
nt.start();
nt.setName("NumberThread");//invoke the start  method
System.out.println(Thread.currentThread().getName());

	}

}
