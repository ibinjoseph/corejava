
public class Cammandline {

	public static void main(String...args) {
		// TODO Auto-generated method stub
		int s=0;
		for(int i=0;i<args.length;i++)
		{
			int x=Integer.parseInt(args[i]);
			s=s+x;
	}
		System.out.println("data is " +s);
}
}
