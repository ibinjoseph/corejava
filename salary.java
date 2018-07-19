
public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary, tax, allowance, net;
		
		salary=15000.78d;
		tax=0.1*salary;
		allowance=0.15*salary;
		net=salary-tax+allowance;
		System.out.println("Salary is "+salary);
		System.out.println("Tax is "+tax);
		System.out.println("Allowance is "+allowance);
		System.out.println("Net Salary is "+net);
		//System.out.printf("Net Salary is: %2", net);
	}

}
