import java.io.*;
public class UserInputExt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Please Enter a Character");
	int x=System.in.read();
	if(x%3==0)
	{
		System.out.println((char)x+" Is Divisible by 3");
	}
	else
	{
		System.out.println((char)x+" Is Not Divisible by 3");

	}

	}

}
