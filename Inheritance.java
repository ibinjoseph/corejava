class Moobile
{
	public void switchOff()
	{
		System.out.println("System is off");
	}
	public void makeCall()
	{
		System.out.println("making a call");
	}
}
class Smartphone extends Moobile
{
	public void playGame()
	{
	System.out.println("gaming");
	}
	public void broesing()
	{
		System.out.println("browsing");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone s=new Smartphone();
		s.makeCall();
	}

}
