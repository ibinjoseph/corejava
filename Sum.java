
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO PERCENTAGE of students in 5 subjects.

		double m1=0, m2=0, m3=0, m4=0, m5=0, average;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input 5 numbers:");
		try 
		{
			m1 = sc.nextDouble();
			m2 = sc.nextDouble();
			m3 = sc.nextDouble();
			m4 = sc.nextDouble();
			m5 = sc.nextDouble();
		} 
		catch (Exception e) {

		}
		average = (m1 + m2 + m3 + m4 + m5) / 5;
		System.out.println("Average is = " + average);
		sc.close();
	}

}
