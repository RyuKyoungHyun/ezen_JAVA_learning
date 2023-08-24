package exec01;
import java.util.*;

public class test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 형변환 공식들
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('A'+'B');
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println('ㄱ'+0);
		System.out.println('J' + "ava");
		
		byte b = 10; 
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		b = (byte)i;
		ch = (char)b;
		short s = (short)ch;
		float f = l;// float f = (float)l 생략가능
		i = ch; // i = (int)ch 생략가능
		
		System.out.printf(" %d %c %d %f %d", b, ch, s, f, i);
		*/
		
		// switch문을 이용한 학점 계산기
		int score = 0;
		float addScore = 0;
		String grade = "";
		String add = "";
		
		System.out.print("점수를 입력해 주세요 => ");
		score = scan.nextInt();
		
		switch (score/10) {
			case 10:
				add = "+";
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6: case 5: case 4: case 3: case 2: case 1: case 0:
				grade = "F";
				break;
			default : grade = "0~100 사이의 숫자로 입력해 주세요";
		}
		
//		addScore = ((float)score/10 - score/10) * 10;
		
		switch (score%10) {
			case 9: case 8: case 7:  
				add = "+";
		}
		
		System.out.printf("점수 : %d / 학점 : %s%s", score, grade, add);
		
		//주민번호를 입력받아서 남자인지 여자인지 출력하기(ex)regNo.charAt(7)
		String regNo = "";
		String msg = "";
		
		System.out.print("주민등록번호를 입력해 주세요 => ");
		regNo = scan.next();
		
		switch (regNo.charAt(7)) {
			case '1', '3' :
				msg = "남자";
				break;
			case '2', '4' :
				msg = "여자";
		}
		
		System.out.printf("%s 입니다", msg);
		
		// Math.random()
		
		double math = Math.random() * 3 +1;
		
		System.out.println((int)math);
		
		// for문 예제 
		
		/* 1 2 3 4 5
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}
		*/
		
		/* 3 6 9
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0 && i != 0) {
			System.out.printf("%d ", i);
			}
		}
		*/
		
		/*
		int total = 0;
		for (int i = 0; i <= 20; i += 2 ) {
			total += i;
		}
		System.out.print(total);
		*/
		
		/* 짝수 합 구하기
		int total = 0;
		String plus = "+";
		for (int i = 0; i <= 20; i++ ) {
			if (i % 2 == 0) {
				switch(i) {
					case 20 : plus = "";
				}
				System.out.printf("%d %s ", i, plus);
				total += i;
			}
		}
		System.out.printf("%n= %d %n", total);
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", 10-i);
		}
		*/
		
		// 구구단	
		
		for (int i = 0; i < 9; i++) {
			System.out.printf("2 * %d = %d %n",i+1,(i+1)*2);
		}
	}
}
