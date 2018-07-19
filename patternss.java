
public class patternss {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1);
			}
			System.out.print("\n");
		}

		System.out.println("---------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(i + 1);
			}
			System.out.print("\n");
		}

		System.out.println("---------------------");

		int num = 0;
		for (int i = 0; i < 10; i++) {
			num += i;
			System.out.print(num + "  ");
		}

		System.out.println("---------------------");

		int num1=5;
		for (int i = 1; i <= 10; i++) {
			System.out.println( num1 + "*" + i + "=" +num1*i);
		}
	}
}
