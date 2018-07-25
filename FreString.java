
public class FreString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am doing C programme";
int count=0;
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)=='C')
	{
		count++;
	}
}
System.out.println(count);
	}

}
