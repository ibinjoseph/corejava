import java.io.*;
public class FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fos=new FileOutputStream("C:\\Users\\Nexwave\\eclipse-workspace\\My_Project\\sample.txt");
fos.write('i');
fos.write('b');
fos.write('i');
fos.write('n');
fos.close();
System.out.println("FileCreated go Check");
	}

}
