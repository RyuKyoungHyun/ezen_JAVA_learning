package exec01;

import java.util.*;
/* 조건문 :  조건에 맞춰서 구문을 실행
 * 
 * 1. if문 : 만약에...
 * 
 * < 형태 >
 * if(조건) {
 * 	// 조건이 참일때 수행될 내용
 * } else {
 *	// 조건이 참일때 수행될 내용의 반대 내용
 * }
 * */

public class test02 {

	public static void main(String[] args) {
		
		/*
		int x = 0;
		
		if(x == 0) {
			System.out.println("x는 0입니다.");
		} else if (x == 1) {
			System.out.println("x는 1입니다.");
		} else {
			System.out.println("x는 0이 아닙니다.");
		}
		*/
		
		/* 1. 스캐너로 숫자 두개 입력 + 연산자
		 * 2. 더하기 연산
		 * 3. 결과값 출력
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		String c = "";
		int d = 0;
		
		
		System.out.print("숫자를 입력해 주세요 => ");
		a = scanner.nextInt();
		System.out.printf("숫자1 : %d %n", a);
		
		
		System.out.print("다음 숫자를 입력해 주세요 => ");
		b = scanner.nextInt();
		System.out.printf("숫자2 : %d %n", b);
		
		System.out.printf("두 숫자에 적용할 연산법을 골라주세요. %n'더하기', '빼기', '곱하기', '나누기' 중에서 입력해 주세요. %n");
		c = scanner.next();
		
		if (c.equals("더하기")) {
			System.out.printf("두 숫자를 더한 값은 %d입니다.", (a+b));
		} else if (c.equals("빼기")) {
			if ( a < b) {
				d = a;
				a = b;
				b = d;
			}
			System.out.printf("두 숫자를 뺀 값은 %d입니다.", (a-b));				
		} else if (c.equals("곱하기")) {
			System.out.printf("두 숫자를 곱한 값은 %d입니다.", (a*b));
		} else if (c.equals("나누기")) {
			System.out.printf("두 숫자를 나눈 값은 %f입니다.", (a/(double)b));
		} else {
			System.out.printf("올바른 키워드로 입력해 주세요. %s", c);
		}

	}

}
