import pack1.*;

public class Testlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MySchool m=new MySchool();
Trainer t = new Trainer();
m.nameOfTheSchool="mac";
m.noOfStudents=50;
m.City="TDPA";
t.age=10;
t.salary=50000;
t.name="Abhi";

System.out.println(m.nameOfTheSchool);
System.out.println(m.noOfStudents);
System.out.println(m.City);
System.out.println(t.age);
System.out.println(t.salary);
System.out.println(t.name);
Labtrainer l=new Labtrainer();
System.out.println(l.salary);
	}

}
