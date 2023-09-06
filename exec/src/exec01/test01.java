package exec01;
import java.util.*;
/* 프로그래 명 :
 * 기능 :
 * 작성일 :
 * 작성자 :
 * 수정일 : 2023.01.04 김아무개 _ 수정 했음
 * */

public class test01 {
	public static class Tv {
		int i =15;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여기
		
		/*
		System.out.printf("Hello!! %n");
		System.out.print("Hello!  ");
		System.out.println("Hello!!! ");
		*/
		
		/* 연산을 위한 단계
		 * 1. 숫자 입력 받기 : scanner
		 * 2. 연산하기 : 변수
		 * 3. 결과 출력하기 : print
		 * */
		
		// 정수를 2개 입력 받아서 결과값 출력하기
		// 1단계 : 2, 5를 입력
		// 2단계 : 2와 5를 변수에 저장
		
		/*
		int a = 2;
		int b = 5;
		int c = a+b;
		int d = a-b;
		int e = a*b;
		double f = a/(double)b;
		System.out.printf("%d와 %d의 합은 %d 입니다. %n", a,b,c);
		System.out.printf(a+"와 "+b+"의 합은 "+(a+b) +" 입니다. %n");
		
		System.out.printf("%d와 %d의 뺄셈은 %d 입니다. %n", a,b,d);
		System.out.printf("%d와 %d의 곱셈은 %d 입니다. %n", a,b,e);
		System.out.printf("%d와 %d의 나누기는 %f 입니다. %n", a,b,f);
		*/
		
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
		
		System.out.print("숫자를 입력해 주세요 => ");
		a = scan.nextInt();
		System.out.printf("숫자1 : %d %n", a);
		
		System.out.print("다음 숫자를 입력해 주세요 => ");
		b = scan.nextInt();
		System.out.printf("숫자2 : %d %n", b);
		
		System.out.println("두 숫자의 합은 "+(a+b)+ " 입니다");
	}
}

