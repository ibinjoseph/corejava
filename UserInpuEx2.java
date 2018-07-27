import java.io.*;
public class UserInpuEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Please Enter a Character");
String name=br.readLine();

String city=br.readLine();
		System.out.println("Welcomey"+name);
		System.out.println("You in "+city);

	

	}

	}

