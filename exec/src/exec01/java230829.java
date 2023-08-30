package exec01;

import java.util.*;

public class java230829 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 자판기 프로그램
				int inMoney = 0; // 투입금액
				int nowMoney =0; // 비교를 위한 금액
				String more = ""; // 선택)음료를 더 할지, 잔액을 뽑을지 선택
				String select = ""; // 선택)
				String menu = "";
				String msg1 = "선택가능 음료 >> ";
				String msg2 = "새로운 메뉴를 입력해 주세요 => ";
				String msg3 = "바꾸실 금액을 입력해 주세요 => ";
				String msg4 = "추가하시려면 '+', 빼시려면 '-'를 입력해 주세요 => ";
				// 메뉴
				String menu1 = "사이다";
				String menu2 = "콜라";
				String menu3 = "커피";
				String menu4 = "유자차";
				// 금액
				int menu1Cost = 1200; 
				int menu2Cost = 1500; 
				int menu3Cost = 1000; 
				int menu4Cost = 800; 
				// 재고
				int menu1Count = (int)(Math.random()* 7)+2;
				int menu2Count = (int)(Math.random()* 7)+2;
				int menu3Count = (int)(Math.random()* 7)+2;
				int menu4Count = (int)(Math.random()* 7)+2;
				// 잔액 코인종류
				int c5000 = 0;
				int c1000 = 0;
				int c500 = 0;
				int c100 = 0;
				int c50 = 0;
				int c10 = 0;
				int c5 = 0;
				int c1 = 0;
				// 종료 / 관리자
				int exit = 0;
				int manage = 0;
				String manSelect = ""; //선택)
				String finalSelect = ""; //선택)
				String change = ""; //선택)
				String addSelect = "";
				int addCount = 0;
				int menuCount = 0;
				
				
				
//				int a = scan.nextLine();
				int a = scan.nextInt();
//				System.out.printf("%d",a);
				System.out.print(5+ a);
				
				System.out.printf("%n1 : %s 로 변경되었습니다.", menu1);
				System.out.printf("%n2 : %s 로 변경되었습니다.", menu2);
				System.out.printf("%n3 : %s 로 변경되었습니다.", menu3);
				System.out.printf("%n4 : %s 로 변경되었습니다.", menu4);
		// 아침 복습
		/*
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
		// do-while
		do {
			System.out.print("더하실 숫자를 입력해 주세요 => ");
				num= scan.nextInt();
				sum += num;
				if (num == 0) {
					System.out.printf("연산결과 : %d%n", sum);}
		} while(num != 0);
		
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
		// do-while
		/*
	  	int com = (int)(Math.random()*50)+1;
	  	int user = 0;
	  	boolean stop = false;
	  	int cnt = 0;
	  	
	  	do {
		  	System.out.println("예상되는 숫자를 입력하세요. : ");
		  	user = scan.nextInt();
	     
		  	if(com == user) {
				System.out.printf("정답입니다. %d \n",com);
				System.out.printf("오답횟수 : %d",cnt);
				stop = true;
		  	} else if(com > user) {
	       		System.out.println("더 큰수를 입력하세요.");
	        	cnt++;   //cnt = cnt +1;
		  	} else {
				System.out.println("더 작은수를 입력하세요.");
				cnt++;
		  	}
	  	} while (!stop);
		
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
		 */
		
		/*
		int num;
		String str;
		System.out.println("num입력");
		num = input.nextInt();
		
		System.out.println("str입력");
		str = input.nextLine();
		
		System.out.println("num : "+num);
		System.out.println("str : "+ str);
		
		System.out.println("숫자를 입력하세요. : ");
		
		// 문자열 -> 숫자열
		int num = Integer.parseInt(input.nextLine());
		
		// 숫자 -> 문자열
		String str = Integer.toString(1234);
		
		System.out.println(str);
		*/
		
		/* String 클래스
		String s = "menual123";
		
		System.out.println(s.charAt(1));
		System.out.println(s.concat(" hello"));
		s = s.concat(" hello2");
		System.out.println(s);
		System.out.println(s.replaceAll("l", "c"));
		
		String animals = "dog catbeararmadilo";
		String[] animal = animals.split(" ",47);
		System.out.println(animal[1]);
		
		int d = 123545413;
		String rr = String.valueOf(d);
		System.out.print(rr);
		*/
	}

}
