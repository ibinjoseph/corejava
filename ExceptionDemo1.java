
public class ExceptionDemo1 {
public static void main(String[] Args)
{
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
try
{
	System.out.println(5/0);
}
catch(ArithmeticException ae) {
	System.out.println("cant divide by zero");
}
System.out.println("EXIT");
}


}
