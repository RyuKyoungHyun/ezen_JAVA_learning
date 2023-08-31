package exec01;
import java.util.*;

public class java230830 {
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
		int costMin = 0; //제일 작은 물품의 가격
		// 재고
		int menu1Count = (int)(Math.random()* 7)+2;
		int menu2Count = (int)(Math.random()* 7)+2;
		int menu3Count = (int)(Math.random()* 7)+2;
		int menu4Count = (int)(Math.random()* 7)+2;
		// 품절표시
		String soldOut1 = "";
		String soldOut2 = "";
		String soldOut3 = "";
		String soldOut4 = "";
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
		String addSelect = ""; //선택)
		int addCount = 0;
		int menuCount = 0;
		
		System.out.printf("자판기 %n1: %s(%d) / 2: %s(%d) / 3: %s(%d) / 4: %s(%d)", menu1,menu1Cost, menu2,menu2Cost, menu3,menu3Cost, menu4,menu4Cost);
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
				manageMode : while (true) {
					System.out.printf("%n원하시는 사항을 골라주세요. %n 1: 재고현황 / 2: 금액변경 / 3: 메뉴변경 /  4: 재고관리 (관리자모드 종료 원활시 '*') => ");
					manSelect = scan.nextLine();
					switch (manSelect.charAt(0)) {
					case '1' : // 재고현황
						System.out.printf("재고현황 => %s: %d / %s: %d / %s: %d / %s: %d",menu1, menu1Count,menu2, menu2Count,menu3, menu3Count,menu4, menu4Count);
						break;
					case '2' : // 금액변경
						costChange : while (true) {
							System.out.printf("%n금액변경 || 변경을 원하시는 메뉴를 골라주세요");
							System.out.printf("%n1: %s(%d) / 2: %s(%d) / 3: %s(%d) / 4: %s(%d) => ",menu1,menu1Cost, menu2,menu2Cost, menu3,menu3Cost, menu4,menu4Cost);
							change = scan.nextLine();
							switch (change.charAt(0)) {
								case '1' :
									System.out.printf("%n변경하실 메뉴: %s(%d) %n%s",menu1, menu1Cost, msg3);
									menu1Cost = Integer.parseInt(scan.nextLine());
									System.out.printf("%n1 : %s(%d) 로 변경되었습니다.", menu1, menu1Cost);
									break ;
								case '2' :
									System.out.printf("%n변경하실 메뉴: %s(%d) %n%s",menu2, menu2Cost, msg3);
									menu2Cost = Integer.parseInt(scan.nextLine());
									System.out.printf("%n2 : %s(%d) 로 변경되었습니다.", menu2, menu2Cost);
									break ;
								case '3' :
									System.out.printf("%n변경하실 메뉴: %s(%d) %n%s",menu3, menu3Cost, msg3);
									menu3Cost = Integer.parseInt(scan.nextLine());
									System.out.printf("%n3 : %s(%d) 로 변경되었습니다.", menu3, menu3Cost);
									break ;
								case '4' :
									System.out.printf("%n변경하실 메뉴: %s(%d) %n%s",menu4, menu4Cost, msg3);
									menu4Cost =Integer.parseInt(scan.nextLine());
									System.out.printf("%n4 : %s(%d) 로 변경되었습니다.", menu4, menu4Cost);
									break ;
								default : 
									System.out.printf("%n1~4, 중에서 입력해 주세요");
									continue costChange;
							}
							
							
							costFinal : while (true) { // 정리 질문
								System.out.printf("%n다른 메뉴를 변경하시려면 1번/ 종료하시려면 2번 / 관리자 홈으로 가시려면 '*'를 눌러주세요 => ");
								finalSelect = scan.nextLine();
								switch (finalSelect.charAt(0)) {
									case '1' :
										continue costChange;
									case '2' :
										break manageMode;
									case '*' :
										continue manageMode;
									default : 
										System.out.printf("%n1~2,'*' 중에서 입력해 주세요.");
										continue costFinal;
								}		
							}	
						}
					case '3' : // 메뉴변경
						menuChange : while (true) {
							System.out.printf("%n메뉴변경 || 변경을 원하시는 메뉴를 골라주세요");
							System.out.printf("%n1: %s(%d) / 2: %s(%d) / 3: %s(%d) / 4: %s(%d) => ",menu1,menu1Cost, menu2,menu2Cost, menu3,menu3Cost, menu4,menu4Cost);
							change = scan.nextLine();
							switch (change.charAt(0)) {
								case '1' :
									System.out.printf("%n변경하실 메뉴: %s %n%s",menu1, msg2);
									menu1 = scan.nextLine();
									System.out.printf("%n1 : %s 로 변경되었습니다.", menu1);
									menu1Count = 0;
									break ;
								case '2' :
									System.out.printf("%n변경하실 메뉴: %s %n%s",menu2, msg2);
									menu2 = scan.nextLine();
									System.out.printf("%n2 : %s 로 변경되었습니다.", menu2);
									menu2Count = 0;
									break ;
								case '3' :
									System.out.printf("%n변경하실 메뉴: %s %n%s",menu3, msg2);
									menu3 = scan.nextLine();
									System.out.printf("%n3 : %s 로 변경되었습니다.", menu3);
									menu3Count = 0;
									break ;
								case '4' :
									System.out.printf("%n변경하실 메뉴: %s %n%s",menu4, msg2);
									menu4 = scan.nextLine();
									System.out.printf("%n4 : %s 로 변경되었습니다.", menu4);
									menu4Count = 0;
									break ;
								default : 
									System.out.printf("%n1~4, 중에서 입력해 주세요");
									continue menuChange;
							}
							menuChangeFinal : while (true) { // 정리 질문
								System.out.printf("%n다른 메뉴를 변경하시려면 1번/ 종료하시려면 2번 / 관리자 홈으로 가시려면 '*'를 눌러주세요 => ");
								finalSelect = scan.nextLine();
								switch (finalSelect.charAt(0)) {
								case '1' :
									continue menuChange;
								case '2' :
									break manageMode;
								case '*' :
									continue manageMode;
								}		
							}	
						}
					case '4' : // 재고관리
						countManage : while (true) {
							System.out.printf("%n재고관리 || 변경을 원하시는 메뉴를 골라주세요. 메뉴명(재고)");
							System.out.printf("%n1: %s(%d) / 2: %s(%d) / 3: %s(%d) / 4: %s(%d) => ",menu1,menu1Count, menu2,menu2Count, menu3,menu3Count, menu4,menu4Count);
							change = scan.nextLine();
							switch (change.charAt(0)) { // 메뉴 고르기
								case '1' :
									System.out.printf("%n변경하실 메뉴: %s",menu1);
									break ;
								case '2' :
									System.out.printf("%n변경하실 메뉴: %s",menu2);
									break ;
								case '3' :
									System.out.printf("%n변경하실 메뉴: %s",menu3);
									break ;
								case '4' :
									System.out.printf("%n변경하실 메뉴: %s",menu4);
									break ;
								default : 
									System.out.printf("%n1~4, 중에서 입력해 주세요");
									continue countManage;
							}
							
							addMinus : while (true) { // 추가/빼기 수량
	 							System.out.printf("%n%s", msg4);
								addSelect = scan.nextLine();
								switch (addSelect.charAt(0)) { 
									case '+' :
										System.out.printf("%n추가하실 수량을 입력해 주세요 => ");
										addCount = Integer.parseInt(scan.nextLine());
		                                                   								menuCount = addCount;
										break addMinus;
									case '-' :
										System.out.printf("%n빼실 수량을 입력해 주세요 => ");
										addCount = Integer.parseInt(scan.nextLine());
										menuCount = 0-addCount;
										break addMinus;
									default :
										System.out.printf("%n'+','-' 중에서 입력해 주세요");
										continue addMinus;
								}
							}
							addInput : while (true) {
								switch (change.charAt(0)) { // 출력
								case '1' :
									menu1Count += menuCount;
									System.out.printf("%n1 : %s(%d) 로 변경되었습니다.", menu1, menu1Count);
									break addInput;
								case '2' :
									menu2Count += menuCount;
									System.out.printf("%n1 : %s(%d) 로 변경되었습니다.", menu2, menu2Count);
									break addInput;
								case '3' :
									menu3Count += menuCount;
									System.out.printf("%n1 : %s(%d) 로 변경되었습니다.", menu3, menu3Count);
									break addInput;
								case '4' :
									menu4Count += menuCount;
									System.out.printf("%n1 : %s(%d) 로 변경되었습니다.", menu4, menu4Count);
									break addInput;
								default : 
									System.out.printf("%n1~4, 중에서 입력해 주세요");
									continue addInput;
								}								
							}
							addFinal : while (true) { // 정리 질문
								System.out.printf("%n다른 메뉴를 변경하시려면 1번/ 종료하시려면 2번 / 관리자 홈으로 가시려면 '*'를 눌러주세요 => ");
								finalSelect = scan.nextLine();
								switch (finalSelect.charAt(0)) {
									case '1' :
										continue countManage;
									case '2' :
										break manageMode;
									case '*' :
										continue manageMode;
									default :
										System.out.printf("%n1~2,'*' 중에서 입력해 주세요");
										continue addFinal;
								}		
							}						
						}
					case '*' :
						break manageMode;
					}
					finalQ : while (true) {					
						System.out.printf("%n관리자 홈으로 돌아가시려면 1번 / 종료하시려면 2번을 눌러주세요 => ");
						manSelect = scan.nextLine();
						switch (manSelect.charAt(0)) {
							case '1' :
								continue manageMode;
							case '2' :
								break manageMode;
							default :
								System.out.printf("%n정해진 번호를 입력해 주세요.");
								continue finalQ;
						}
					}
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
					manage = 1;
					continue Vendar;
				default :
					System.out.printf("1~9에서 입력해 주세요%n");
					
			}
			System.out.printf("들어간 금액 : %d원%n", inMoney);
			
			if (coin.charAt(0) == '9') { // 메뉴 고르기
				menuShow : while (true) {
					System.out.printf("%n%s",msg1);
					if (inMoney >= menu1Cost) {// 메뉴 보여주기
						if (menu1Count <= 0) {
							soldOut1 = "[품절!]";
						} else {			
							soldOut1 = "";
						}
						System.out.printf("1: %s%s(%d) / ", soldOut1,menu1,menu1Cost);
					}
					if (inMoney >= menu2Cost) {
						if (menu2Count <= 0) {
							soldOut2 = "[품절!]";
						} else {			
							soldOut2 = "";
						}
						System.out.printf("2 : %s%s(%d) / ", soldOut2,menu2,menu2Cost);
					}
					if (inMoney >= menu3Cost) {
						if (menu3Count <= 0) {
							soldOut3 = "[품절!]";
						} else {			
							soldOut3 = "";
						}
						System.out.printf("3: %s%s(%d) / ", soldOut3,menu3, menu3Cost);
					}
					if (inMoney >= menu4Cost) {
						if (menu4Count <= 0) {
							soldOut4 = "[품절!]";
						} else {			
							soldOut4 = "";
						}
						System.out.printf("4: %s%s(%d) / ", soldOut4,menu4, menu4Cost);
					}
					// 최소값 구하기
					if (menu1Cost <= menu2Cost) {
						costMin = menu1Cost;
						if (menu1Cost <= menu3Cost) {
							costMin = menu1Cost;
							if (menu1Cost <= menu4Cost) {
								costMin = menu1Cost;
							} else {
								costMin = menu4Cost;
							}
						} else {
							costMin = menu3Cost;
							if (menu3Cost <= menu4Cost) {
								costMin = menu3Cost;
							} else {
								costMin = menu4Cost;
							}
						}
					} else {
						if (menu2Cost <= menu3Cost) {
							costMin = menu2Cost;
							if (menu2Cost <= menu4Cost) {
								costMin = menu2Cost;
							} else {
								costMin = menu4Cost;
							}
						} else {
							costMin = menu3Cost;
							if (menu3Cost <= menu4Cost) {
								costMin = menu3Cost;
							} else {
								costMin = menu4Cost;
							}
						}
					}
					
					
					if (inMoney >= costMin) {
						nowMoney = inMoney; 
						menuSelect : while (true) {
							System.out.printf("%n음료를 골라주세요 (금액추가 투입 원할시 9 입력) (잔액반환시 '-'을 입력해 주세요) => ");
							select = scan.nextLine();
							switch (select.charAt(0)) { // 선택한 음료값만큼 잔액삭감 & 재고삭감
							case '1' :
								if (soldOut1.equals("[품절!]")) {
									System.out.printf("%n품절인 상품입니다. 다시 골라주세요");
									continue menuShow;
								} else {									
									menu = menu1;
									inMoney -= menu1Cost;
									menu1Count -= 1;
								}
								break menuSelect;
							case '2' :
								if (soldOut2.equals("[품절!]")) {
									System.out.printf("%n품절인 상품입니다. 다시 골라주세요");
									continue menuShow;
								} else {
								menu = menu2;
								inMoney -= menu2Cost;
								menu2Count -= 1;
								}
								break menuSelect;
							case '3' :
								if (soldOut3.equals("[품절!]")) {
									System.out.printf("%n품절인 상품입니다. 다시 골라주세요");
									continue menuShow;
								} else {
								menu = menu3;
								inMoney -= menu3Cost;
								menu3Count -= 1;
								}
								break menuSelect;
							case '4' :
								if (soldOut4.equals("[품절!]")) {
									System.out.printf("%n품절인 상품입니다. 다시 골라주세요");
									continue menuShow;
								} else {
								menu = menu4;
								inMoney -= menu4Cost;
								menu4Count -= 1;
								}
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
							System.out.printf("%n현재잔액: %d",inMoney);
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
					} else {
						System.out.printf("없음 잔액이 부족합니다%n");
					}
					break menuShow;
				}
			}
		}
	}
}
