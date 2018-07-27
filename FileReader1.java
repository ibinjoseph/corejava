import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Nexwave\\eclipse-workspace\\My_Project\\sample1.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeBytes("FirstLine");

		fos.write(a);
		fos.close();
		
		
		
		System.out.println("FileCreated go Check");
		
	}

}
