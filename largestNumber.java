
public class largestNumber {

	public static void main(String[] args) {

		int a, b;
		a = 0;
		b = 0;

		if (a != 0 || b != 0)
		{
			if (a > b) {
				System.out.println("Ais greater");
			} else if (b > a) {
				System.out.println("B is greater");
			} else {
				System.out.println("Both are equal");
			}
		}
		else
			System.out.println("Both must not equal to zero");
	}

}
