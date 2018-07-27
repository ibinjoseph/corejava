import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputExc3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
	System.out.println("Enter the 1st ");
	int i=Integer.parseInt(br.readLine());
	System.out.println("Enter the 1st ");
	int j=Integer.parseInt(br.readLine());
	System.out.println("Enter the 1st ");
	int k=Integer.parseInt(br.readLine());
	System.out.println("Enter the 1st ");
	int l=Integer.parseInt(br.readLine());
	System.out.println("Enter the 1st ");
	int m=Integer.parseInt(br.readLine());
	float x=(i+j+k+m+l)/5;
	System.out.println("Avg"+x);

	}

}
