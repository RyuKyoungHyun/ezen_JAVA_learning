package exec01;
import java.util.*;

public class self {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 배열에 랜덤 숫자 저장&출력
		int[] Arr = new int[7];
		
		for (int i =0; i < 7; i++) {
			Arr[i] = (int)(Math.random()*10)+1;
			System.out.printf("%d | ", Arr[i]);
			
		}
		
		System.out.println();
		// 인덱스짝수
		for (int i =2; i <7; i+=2) {
			System.out.printf("%d | ", Arr[i]);
		}
		
		System.out.println();
		// 값이 짝수
		for (int i= 0; i <7; i++) {
			if (Arr[i] %2 == 0) {
				System.out.printf("%d | ", Arr[i]);
			}
		}
	}
}