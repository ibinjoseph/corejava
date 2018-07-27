import java.io.*;
public class FileReadDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\Nexwave\\eclipse-workspace\\My_Project\\MyFile.txt");
int xx=fis.read();
while (xx!=-1)
{
	System.out.print((char)xx);
	xx=fis.read();
}
fis.close();
	}

}
