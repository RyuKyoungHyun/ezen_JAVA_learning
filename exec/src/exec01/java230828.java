package exec01;

import java.util.*;

public class java230828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		/* for문 예제
		// 1번
		for (int m = 0; m < 3; m++) {			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.printf("%d%d%d%n",m+1,i+1,j+1);
				}
		}
		}
		
		System.out.println();
		
		//2번
		for (int i = 0; i < 5; i++) {
			for(int j=0; j < 5; j++) {				
				System.out.printf("[%d,%d]",i+1, j+1);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//3번
		
		for (int i =0; i < 5; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("     ");
			}
			System.out.printf("[%d,%d]%n",i+1, i+1);
		}
		*/
		
		/*
		// 정수 문제
		// 문제1) 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
		int total = 0;
		for (int i =1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				total += i;
			}
		}
		System.out.printf("문제1) 총합 : %d", total);
		
		System.out.println();
		
		// 문제2) 1+(1+2)+(1+2+3)+(1+2+3+4)+.....+(1+2+3+4+5+6+7+8+9+10) 의 결과를 계산하시오.
		int total2 = 0;
		for (int i =1; i <=10; i++) {
			for (int j = 1; j <=i; j++) {
				total2 += j;
			}
		}
		System.out.printf("문제2) 총합 : %d", total2);
		
		System.out.println();
		
		// 문제3) 1+(-2)+3+(-4)+....과 같은 식으로 계속 더해나갔을때 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		int total3 = 0;
		int result = 0;
		for (int i = 1; true; i++) {
			if (i % 2 == 0) {
				total3 -= i;
			} else {
				total3 += i;
			}
			if (total3 >= 100) {
				System.out.printf("문제3) 총합 : %d", i);
				break;
			}
		}
		
		System.out.println();
		
		// 문제4) 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		System.out.printf("문제4) 6이 되는 경우의 수 : ");
		for (int i = 1; i<=6; i++) {
			for (int j =1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.printf("(%d,%d)", i, j);
				}
			}
		}
		
		System.out.println();
		
		// 문제5) 1~6사이의 임의의 정수를 변수 value에 저장하고 그 값을 출력하는 코드를 완성하라.
		int value = (int)(Math.random() * 6 +1);
		System.out.printf("문제5) 변수값 : %d", value);
		
		System.out.println();
		
		// 문제6) 방정식 2x+4y=10의 모든 해를 구하시오. x,y는 정수이고, 범위는 0<=(x,y)<=10
		System.out.printf("문제6) 방정식의 모든 해 : ");
		for (int x = 0; x<= 10; x++) {
			for(int y= 0; y<=10; y++) {
				if (2 *x + 4* y == 10) {
					System.out.printf("(%d,%d)", x,y);
				}
			}
		}
		System.out.println();
		int math = (int)(Math.random() * 10 +1);
		System.out.print(math);
		*/
		
		/*
		String regNo = "";
		String msg = "";
		
		while (true) {
			System.out.printf("주민번호를 입력하세요 (종료시 'exit' 입력)%n=> ");
			regNo = scan.next();
			if (regNo.equals("exit")) {	
				System.out.print("종료입니다");
				break;
			} else {
				switch (regNo.charAt(7)) {
				case '1', '3' :
					msg = "남자";
					break;
				case '2', '4' :
					msg = "여자";
				default :
					msg = "올바르지 않은 입력";
				}
				System.out.printf("%s입니다%n----------%n", msg);
			}
		}
		*/
		
		/* while문 예제
		int i = 0;
		
		while(i <= 10) {
			int j = 0;
			while (j <=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		/*
		// 합 구하기 프로그램
		int sum = 0;
		while(true) {
			System.out.print("더하실 숫자를 입력해 주세요. => ");
			int num = scan.nextInt();

			sum += num;
			if (num == 0) {
				System.out.printf("연산결과 : %d%n",sum);
				break;
			}
		}
		
		// 1~ 50까지의 수 맞추기
		int random = (int)(Math.random()*50) +1;
		int select = 0;
		
		System.out.printf("1~50사이 숫자 중 맞춰보세요! => ");
		int j = 0;
		while (true) {
			select = scan.nextInt();
			if (0 >= select || select > 50) {
				System.out.printf("1~50사이의 숫자를 입력해 주세요. => ");
			} else if (select > random) {
				System.out.printf("더 작은 수를 입력하세요 => ");
			} else if (select < random) {
				System.out.printf("더 큰 수를 입력하세요 => ");	
			} else {
				System.out.printf("정답입니다. %d%n", select);
				System.out.printf("오답횟수 : %d", j);
				break;
			}
			j++;
		}
		*/
	}

}
