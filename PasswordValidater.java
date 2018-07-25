
public class PasswordValidater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "Inhh5@";

		int upflag = 0;
		int cflag = 0;
		int sflag = 0;
		int wflag = 0;
		char aa[] = password.toCharArray();
		if (aa.length >= 5 && aa.length <= 10)
		{
			
			for (int i = 0; i < aa.length; i++) {
				Character s = new Character(aa[i]);
				if (Character.isDigit(s)) {
					cflag = 1;
				} else if (Character.isLetter(s)) {
					if (Character.isUpperCase(s)) {

						upflag = 1;
					}
				} else if (Character.isWhitespace(s)) {
					wflag = 1;
				} else
				{
					
				sflag = 1;
				}
			}
			if(cflag==1&&upflag==1&&sflag==1&&wflag!=1) {
				System.out.println("Valid Password");
			}
			else 
				System.out.println("Invalid");

	}
		else {
			System.out.println("invalid");
		}
}
}
