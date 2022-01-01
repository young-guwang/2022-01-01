import java.util.Scanner;

public class tarrtarr8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int a = 1; a <=i ; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}