
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
StringBuffer name=new StringBuffer("Gopika");
StringBuffer name1=new StringBuffer();
for (int i = name.length()-1; i >=0; i--) {
	name1=name1.append(name.charAt(i));
	
}
System.out.println(name1);
	}

}
