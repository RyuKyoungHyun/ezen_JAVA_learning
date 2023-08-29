package exec01;
import java.util.*;

public class self {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 자판기 프로그램
		int inMoney = 0; // 투입금액
		int nowMoney =0; // 비교를 위한 금액
		String more = ""; // 선택)음료를 더 할지, 잔액을 뽑을지 선택
		String select = ""; // 선택)
		String menu = "";
		String msg1 = "선택가능 음료 >> ";
		int sai = 1200; //사이다 금액
		int coke = 1500; //콜라 금액
		int coffee = 1000; //커피 금액
		int yuja = 800; //유자차 금액
		// 재고
		int saiCount = (int)(Math.random()* 7)+2;
		int cokeCount = (int)(Math.random()* 7)+2;
		int coffeeCount = (int)(Math.random()* 7)+2;
		int yujaCount = (int)(Math.random()* 7)+2;
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
		
		System.out.printf("자판기 %n1: 사이다(%d) / 2: 콜라(%d) / 3: 커피(%d) / 4: 유자차(%d)", sai, coke, coffee, yuja);
		System.out.printf("%n금액을 투입 후 물품을 골라주세요.");
		
		Vendar : while (true) {
			
			if (exit == 1) {
				System.out.printf("%n잔액이 반출됩니다.");
				System.out.printf("%n잔액결과 : %d원", inMoney);
				while(inMoney >= 0) {// 잔액계산
					if (inMoney >= 50000) {
						c5000 = inMoney / 50000;
						inMoney -= c5000 * 50000;
					} else if (inMoney >= 10000) {
						c1000 = inMoney / 10000;
						inMoney -= c1000 * 10000;
					} else if (inMoney >= 5000) {
						c500 = inMoney / 5000;
						inMoney -= c500 * 5000;
					} else if (inMoney >= 1000) {
						c100 = inMoney / 1000;
						inMoney -= c100 * 1000;
					} else if (inMoney >= 500) {
						c50 = inMoney / 500;
						inMoney -= c50 * 500;
					} else if (inMoney >= 100) {
						c10 = inMoney / 100;
						inMoney -= c10 * 100;
					} else if (inMoney >= 50) {
						c5 = inMoney / 50;
						inMoney -= c5 * 50;
					} else if (inMoney >= 10) {
						c1 = inMoney / 10;
						inMoney -= c1 * 10;
					} else {
						break;
					}
				}
				System.out.printf("%n>> 50000 %d장, 10000 %d장, 5000 %d장, 1000 %d장, 500 %d개, 100 %d개, 50 %d개, 10 %d개", c5000, c1000, c500, c100, c50, c10, c5, c1);
				System.out.printf("%n자판기를 종료합니다.");
				break Vendar;
			}
			
			if (manage == 1) {
				while (true) {
					System.out.printf("%n원하시는 사항을 골라주세요. %n 1: 재고현황 / 2: 금액변경 / 3: 메뉴변경 /  4: 재고관리 => ");
					manSelect = scan.nextLine();
					switch (manSelect.charAt(0)) {
					// 여기부터 하기
					}
					break;
				}
				manage = 0;
			}
			
			String coin = "";//선택)
			System.out.printf("%n1: 10원, 2: 50원, 3: 100원, 4: 500원, 5: 1000원, 6: 5000원, 7: 10000원, 8: 50000원%n해당 번호를 누르면 금액이 들어갑니다. (음료를 고르실려면 9을 입력해주세요.) (잔액반환시 '-'을 입력해 주세요) (관리자모드 : *) => ");
			coin = scan.nextLine();
			switch (coin.charAt(0)) { // 동전 넣기
				case '1' :
					inMoney += 10;
					break;
				case '2' :
					inMoney += 50;
					break;
				case '3' :
					inMoney += 100;
					break;
				case '4' :
					inMoney += 500;
					break;
				case '5' :
					inMoney += 1000;
					break;
				case '6' :
					inMoney += 5000;
					break;
				case '7' :
					inMoney += 10000;
					break;
				case '8' :
					inMoney += 50000;
					break;
				case '9' :
					break;
				case '-' :
					exit =1;
					continue Vendar;
				case '*' :
				default :
					System.out.printf("1~9에서 입력해 주세요%n");
					
			}
			System.out.printf("들어간 금액 : %d원%n", inMoney);
			
			if (coin.charAt(0) == '9') { // 메뉴 고르기
				menuShow : while (true) {
					if (inMoney >= coke) {// 메뉴 보여주기
						System.out.printf("%n%s1: 사이다(%d) / 2: 콜라(%d) / 3: 커피(%d) / 4: 유자차(%d)",msg1,sai, coke, coffee, yuja);
					} else if (inMoney >= sai) {
						System.out.printf("%n%s1 : 사이다(%d) / 3: 커피(%d) / 4: 유자차(%d)",msg1, sai, coffee, yuja);
					} else if (inMoney >= coffee) {
						System.out.printf("%n%s3: 커피(%d) / 4: 유자차(%d)",msg1,coffee, yuja);
					} else if (inMoney >= yuja) {
						System.out.printf("%n%s4: 유자차(%d)",msg1,yuja);
					} else {
						System.out.printf("%n%s없음 잔액이 부족합니다%n",msg1);
					}
					
					if (inMoney >= yuja) {
						nowMoney = inMoney; 
						menuSelect : while (true) {
							System.out.printf("%n음료를 골라주세요 (금액추가 투입 원할시 9 입력) (잔액반환시 '-'을 입력해 주세요) => ");
							select = scan.nextLine();
							switch (select.charAt(0)) { // 선택한 음료값만큼 잔액삭감
							case '1' :
								menu = "사이다";
								inMoney -= 1200;
								break menuSelect;
							case '2' :
								menu = "콜라";
								inMoney -= 1500;
								break menuSelect;
							case '3' :
								menu = "커피";
								inMoney -= 1000;
								break menuSelect;
							case '4' :
								menu = "유자차";
								inMoney -= 800;
								break menuSelect;
							case '9' :
								continue Vendar;
							case '-' :
								exit =1;
								continue Vendar;
							default :
								System.out.printf("올바르지않습니다. 다시 입력해주세요");	
								continue menuSelect;
							}
						}
						if (nowMoney > inMoney) { // 음료반출					
							System.out.printf("%n덜컹! %s가 나왔습니다.", menu);
							addSelect : while (true) {
									
								System.out.printf("%n음료를 더 뽑고싶다면 1번 / 금액을 추가로 넣으시려면 2번 / (잔액반환시 '-'을 입력해 주세요) => ");
								more = scan.nextLine();
								switch (more.charAt(0)) {
									case '1' :
										System.out.printf("%n들어간 금액 : %d원", inMoney);
										continue menuShow;
									case '2' :
										continue Vendar;
									case '-' :
										exit = 1;
										continue Vendar;
									default : 
										System.out.print("1,2,'-' 중에서 입력해 주세요.");
										continue addSelect;
								}	
							}
						}
					}	
					break menuShow;
				}
			}
		}
	}
}