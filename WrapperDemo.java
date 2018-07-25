
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String company="Deloitte is a good company @";
char c[]=company.toCharArray();
for(int i=0;i<c.length;i++)
{
	Character x=new Character(c[i]);
	if(Character.isDigit(x)) {
		System.out.println(x+"is digit");
	}
	else if(Character.isLetter(x))
	{
		System.out.println(x+" is letter");
	}
	else if(Character.isWhitespace(x)) {
		System.out.println(x+" Is a whitespace");
	}
		else 
		{
			
			System.out.println(x+" is a special character");
		}
		
	}
	
}
	}

