class Employee
{
	
}
class Hr extends Employee
{
	
}
class Technical extends Employee
{
	
}
class Recruiter extends Hr
{
	
}
class Financiar extends Hr
{
	
}
class Javapm extends Technical
{
	
}
class Mainframe extends Technical
{
	
}
public class MIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Technical t= new Javapm();
Hr h=new Recruiter();
Employee e = new Hr();
Employee E1 = new Mainframe();


	}

}
