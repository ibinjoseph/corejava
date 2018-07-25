interface TVRemote
{
	public void switchoff();
	public void switchon();
	public void changeName();
	public void increaseVolume();
	public void decreaseVolume();
	
}
class sony implements TVRemote
{

	@Override
	public void switchoff() {
		// TODO Auto-generated method stub
		System.out.println("Sony Switchoff");
	}

	@Override
	public void switchon() {
		// TODO Auto-generated method stub
		System.out.println("Sony Switch On");
	}

	@Override
	public void changeName() {
		// TODO Auto-generated method stub
		System.out.println("Sony Change Name");
	}

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Sony Increase Volume");
	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Sony Decraese Volume");
	}
	
}
class samsung implements TVRemote
{

	@Override
	public void switchoff() {
		// TODO Auto-generated method stub
		System.out.println("samsung Decraese Volume");
	}

	@Override
	public void switchon() {
		// TODO Auto-generated method stub
		System.out.println("samsung Decraese Volume");
	}

	@Override
	public void changeName() {
		// TODO Auto-generated method stub
		System.out.println("samsung Decraese Volume");
	}

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("samsung Decraese Volume");
	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("samsung Decraese Volume");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sony s=new sony();
samsung s1=new samsung();
s.changeName();
s.decreaseVolume();
s.increaseVolume();
s.switchoff();
s.switchon();
s1.changeName();
s1.increaseVolume();
s1.decreaseVolume();
s1.switchoff();
s1.switchon();
	}

}
