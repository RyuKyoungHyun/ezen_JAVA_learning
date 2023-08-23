package exec01;
import java.util.*;

public class test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		String msg = "";
		
		System.out.print("3의 배수인 숫자를 입력해 주세요 => ");
		a = scan.nextInt();
		
		/*
		if (a > 0 && a % 3 == 0) {
			msg = "정답입니다";
		} else {
			msg = "틀렸습니다";
		} 
		*/
		  
		msg = a>0 && (a % 3 == 0) ? msg = "정답입니다" : "틀렸습니다";
		
		System.out.print(msg);
	}
}
