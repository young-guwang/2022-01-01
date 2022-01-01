import java.util.Scanner;

public class tarrtarr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		String a = sc.next();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h == 0 && m<45) {
			h = 23;
			m = m + 15;
		}
		else if(m>=45) {
			m = m - 45;
		}
		else if(h>0 && m<45) {
			h = h - 1;
			m = m + 15;
		}
		System.out.printf("%d %d", h,m);
		
	}

}
