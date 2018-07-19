
public class TestBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Band b1=new Band();
Band b2=new Band();
String s1[]= {"a","b","c"};
String g1[]= {"d","e","f"};
String s2[]= {"aa","bb","hh"};
String g2[]= {"ff","jj","dd"};
b1.setBandDetails("ibin", s1, g1, "drum", "ke");
b2.setBandDetails("ibin", s2, g2, "drum", "key");
b1.printBandDetails();
b2.printBandDetails();
int a,b;
a=b1.countMembers();
b=b2.countMembers();
System.out.println(a+ " " +b);
	}

}
