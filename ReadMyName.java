import java.io.*;


public class ReadMyName {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.out.println("Please Enter a Character");
////int x=System.in.read();
//System.out.println((char)x);
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter Your Name please");
String myName=br.readLine();
System.out.println("Welcome "+myName);

}
}