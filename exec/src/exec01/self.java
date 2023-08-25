package exec01;
import java.util.*;

public class self {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String my_string = "abcdef";
		String letter = "f";
		
		String answer = "";
        for (int i =0; i < my_string.length(); i++) {
        	if (my_string.charAt(i) != letter.charAt(0)) {
                answer += my_string.charAt(i);
             }
        }
        System.out.print(answer);
		
		// 트리
		System.out.println();
		String tree = "";
		int ht = 0;
		System.out.print("트리를 세워보아요. 원하는 높이만큼 입력 => ");
		ht= scan.nextInt();
		
		for (int i =0; i <= ht; i++) {
			for(int j = 0; j < ht-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}