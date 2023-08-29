package exec01;
import java.util.*;

public class self {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1번
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <i; j++) {
				System.out.print("     ");
			}
			System.out.printf("[%d,%d]%n", i+1, i+1);
		}
		
		// 2번
		int sum = 0;
		int num = 0;
		while (true) {
			System.out.print("더하실 숫자를 입력해 주세요 => ");
			num= scan.nextInt();
			sum += num;
			if (num == 0) {
				System.out.printf("연산결과 : %d%n", sum);
				break;
			}
		}
		// 3번
		int range = (int)(Math.random() * 50)+1;
		int a = 0;
		String msg = "";
		System.out.print("1~50까지의 수 중 맞춰 보세요! => ");
		int i = 0;
		while (true) {
			a = scan.nextInt();
			if (a <= 0 || a > 50) {
				msg = "1~50사이로";
			} else if (a > range) {
				msg = "작은 수를";
			} else if (a < range) {
				msg = "큰 수를";
			} else {
				msg = "정답입니다. 오답횟수 :"+ i;
				System.out.print(msg);
				System.out.println();
				break;
			}
			System.out.printf("%s 입력해 주세요 => ", msg);
			i++;
		}
		
		System.out.println();
		
		// 4번
		int c = 0;
		while (c < 5) {
			int d = 0;
			while (d < 5-c) {
				System.out.print("*");
				d++;
			}
			System.out.println();
			c++;
		}
	}
}