import java.io.*;

public class WriteFileEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
FileWriter fw=new FileWriter("C:\\Users\\Nexwave\\eclipse-workspace\\My_Project\\sample3.txt");
BufferedWriter bw=new BufferedWriter(fw);
while(true)
{
	System.out.println("Enter Data");
String line=br.readLine();
if(!line.equalsIgnoreCase("Stop"))
{
	bw.write(line);
	bw.newLine();
	
}
else
{
	break;
}

}
bw.close();
fw.close();
System.out.println("Bingo");

	}

}
