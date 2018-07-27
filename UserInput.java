import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
int count=0;
		while(true)
		{
			System.out.println("Enter City");
			String city=br.readLine();
			if(!city.equalsIgnoreCase("stop"))
			{
				count++;
			}
			else
			{
				break;
			}
		
			
			}
		System.out.println(count);
	}

}
