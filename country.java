
public class country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ccountry[]= {"india","us","a","b"};
String capital[]= {"a","la","c","d"};
String gcountry="india";
int flag=0;
for(int i=0;i<capital.length;i++)
{
	if(ccountry[i].equals(gcountry))
	{
		flag=1;
		System.out.println("Capital is "+capital[i]);
	break;
	}
}

	if(flag==0)
	{
		System.out.println("Not Found");
	}
}
}