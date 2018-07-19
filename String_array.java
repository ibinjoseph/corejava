
public class String_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[]= {"Roobini","Vatsala","Jijo","Jilu","Aflaksha","Guru"};
int found=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i].equals("Guru"))
		found=1;
	System.out.println("Guru found at"+i);
	break;

}
if(found==0)
{
	System.out.println("not found");
}

	}
}
