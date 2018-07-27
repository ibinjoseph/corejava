import java.io.*;
public class FileDemo1 {

	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//File f=new File("D:\\app\\Nexwave\\MynewFile");
//boolean created =f.createNewFile();
//if(created)
//	System.out.println("File Created successFully");
//else
//	System.out.println("There is some problem couldnt create");
		File f=new File("D:\\app\\Nexwave\\Ibin_new_Folder");
		boolean status=f.mkdir();
		if(status)
			System.out.println("Folder Created successFully");	
		else
			System.out.println("There is some problem couldnt create");	
	}

}
