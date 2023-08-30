package exec01;
import java.util.*;

public class self {
	public static void main(String[] args) {
        int tem1 = 1000;//사이다 금액
        int tem2 = 1000;//콜라 금액 
        int tem3 = 800;//커피 금액
        int tem4 = 500;//유자차 금액
        int inputWon = 0;//입금되는 금액@@
        int tot = 0; //금액 저장고, 입금은+ 템들은 -처리@@
        int tem1su = 5;//사이다 수량
        int tem2su = 5;//콜라 수량
        int tem3su = 5;//커피 수량
        int tem4su = 5;//유자차 수량
        String tem11 = "사이다";//상품명
        String tem22 = "콜라";//상품명
        String tem33 = "커피";//상품명
        String tem44 = "유자차";//상품명
        String sel1 = "판매";//사이다판매 가능 상태
        String sel2 = "판매";//콜라 판매 가능 상태
        String sel3 = "판매";//커피 판매 가능 상태
        String sel4 = "판매";//유자차 판매 가능 상태
        Scanner scan = new Scanner(System.in);//@@         
        String impo = null;//스캐너 입력 칸@@
        int order ;//@@            
  Loop11:   do {
        sel1 = tem1su > 0 ? "판매" : "품절";
        sel2 = tem2su > 0 ? "판매" : "품절";
        sel3 = tem3su > 0 ? "판매" : "품절";
        sel4 = tem4su > 0 ? "판매" : "품절";
        System.out.println("==============================================================================================");
        System.out.printf(" 1.%s(%d원)%s\t 2.%s(%d원)%s\t 3.%s(%d원)%s \t 4.%s(%d원)%s%n",
              tem11, tem1,sel1, tem22, tem2,sel2, tem33, tem3, sel3, tem44, tem4, sel4);
        System.out.println(" 입금시 10.'input' \t 종료시 20.'exit' \t 관리자모드시 90.'관리자모드'");
        System.out.printf(" 현재 잔액 : %d %n", tot);
        System.out.println("==============================================================================================");
        impo = scan.nextLine();//스캐너 진행
        if (impo.equals("관리자모드")|| impo.equals("90")) {//금액 변경, 메뉴 변경, 재고 관리
     Loop1: for (;;) {
              System.out.println(" 실행 명령을 선택해 주세요");
              System.out.println(" 91.금액 변경, 92.메뉴 변경, 93.재고 관리, 99.관리자종료, 00.프로그램 종료");
              impo = scan.nextLine();
              if (impo.equals("금액 변경")|| impo.equals("91")) {
                 System.out.printf(" 금액 변경 원하는 상품 숫자를 선택하세요.%n 1. %s(%d원) 2.%s(%d원) 3.%s(%d원) 4.%s(%d원) 5.뒤로 %n",
                       tem11, tem1, tem22, tem2, tem33, tem3, tem44, tem4);
                 order = Integer.parseInt(scan.nextLine());
                 switch (order) {
                    case 1:
                       System.out.printf(" %s %d에서 얼마로 변경 할까요?%n", tem11, tem1);
                       tem1 = Integer.parseInt(scan.nextLine());                  
                       break;
                    case 2:
                       System.out.printf(" %s %d에서 얼마로 변경 할까요?%n", tem22, tem2);
                       tem2 = Integer.parseInt(scan.nextLine());                  
                       break;
                    case 3:
                       System.out.printf(" %s %d에서 얼마로 변경 할까요?%n", tem33, tem3);
                       tem3 = Integer.parseInt(scan.nextLine());                  
                       break;
                    case 4:
                       System.out.printf(" %s %d에서 얼마로 변경 할까요?%n", tem44, tem4);
                       tem4 = Integer.parseInt(scan.nextLine());                  
                       break;
                    default:
                       break;
                 }
              }
              if (impo.equals("메뉴 변경")|| impo.equals("92")) {
                 System.out.printf(" 메뉴 변경 원하는 상품 숫자를 선택하세요.%n 1. %s 2.%s 3.%s 4.%s 5.뒤로%n", 
                       tem11, tem22, tem33, tem44);
                 order = Integer.parseInt(scan.nextLine());
                 switch (order) {
                    case 1:
                       System.out.printf(" %s 에서 무엇으로 변경 할까요?%n", tem11);
                       tem11 = scan.nextLine();
                       tem1su = 0;
                       break;
                    case 2:
                       System.out.printf(" %s 에서 무엇으로 변경 할까요?%n", tem22);
                       tem22 = scan.nextLine();
                       tem2su = 0;
                       break;
                    case 3:
                       System.out.printf(" %s 에서 무엇으로 변경 할까요?%n", tem33);
                       tem33 = scan.nextLine();
                       tem3su = 0;
                       break;
                    case 4:
                       System.out.printf(" %s 에서 무엇으로 변경 할까요?%n", tem44);
                       tem44 = scan.nextLine();
                       tem4su = 0;
                       break;
                    default:
                       break Loop1;
                 }
              }
              if (impo.equals("재고 관리")|| impo.equals("93")) {
                 System.out.printf(" 현재 재고\t%s %d개,\t %s %d개,\t %s %d개,\t %s %d개%n", 
                       tem11, tem1su, tem22, tem2su, tem33, tem3su, tem44, tem4su);
                 System.out.printf(" 재고 변경 원하는 상품 숫자를 선택하세요.%n "
                       + "1. %s(%d개)\t 2. %s(%d개)\t 3. %s(%d개)\t 4. %s(%d개) 5. 뒤로%n",
                       tem11, tem1su, tem22, tem2su, tem33, tem3su, tem44, tem4su);
                 order = Integer.parseInt(scan.nextLine());
                 switch (order) {
                 case 1 :
                    System.out.println(" 현재 재고 : "+ tem1su);
                    System.out.println(" 변경 원하는 수량을 입력 하세요.");
                    tem1su += Integer.parseInt(scan.nextLine());
                    tem1su = tem1su < 0 ? 0 : tem1su;
                    System.out.printf(" 변경 후 %s\t%d%n",tem11,tem1su);
                    break;
                 case 2 :
                    System.out.println(" 현재 재고 : "+ tem2su);
                    System.out.println(" 변경 원하는 수량을 입력 하세요.");
                    tem2su = Integer.parseInt(scan.nextLine());
                    tem2su = tem2su < 0 ? 0 : tem2su;
                    System.out.printf(" 변경 후 %s\t%d%n",tem22,tem2su);
                    break;
                 case 3 :
                    System.out.println(" 현재 재고 : " + tem3su);
                    System.out.println(" 변경 원하는 수량을 입력 하세요.");
                    tem3su = Integer.parseInt(scan.nextLine());
                    tem3su = tem3su < 0 ? 0 : tem3su;
                    System.out.printf(" 변경 후 %s\t%d%n",tem33,tem3su);
                    break;
                 case 4 :
                    System.out.println(" 현재 재고 : " + tem4su);
                    System.out.println(" 변경 원하는 수량을 입력 하세요.");
                    tem4su = Integer.parseInt(scan.nextLine());
                    tem4su = tem4su < 0 ? 0 : tem4su;
                    System.out.printf(" 변경 후 %s\t%d%n",tem44,tem4su);
                    break;
                 default:
                    break Loop1;
                 }
              }
              if (impo.equals("관리자종료") || impo.equals("99")) {
                 System.out.println(" 관리자 모드 종료합니다.");
                 break;
              }
              if (impo.equals("프로그램 종료") || impo.equals("00")) {
                 break Loop11;
              }
           }   
        }
        if (impo.equals("input") || impo.equals("10")) {
           System.out.println(" 입금 금액을 적어주세요.");
           inputWon = Integer.parseInt(scan.nextLine());
           if(inputWon>0) {
           tot += inputWon;//1tot==0-> 1tot+1price=2tot-won=3tot+2price=3tot
           }
        }
        if (impo.equals("사이다") || impo.equals("1")) {
           if(tot >= tem1 && tem1su > 0) {                     
              System.out.printf(" %s가 나옵니다.%n", tem11);
              tem1su = tem1su - 1;
              tot = tot - tem1;   
           }else if(tot < tem1) {
              System.out.println(" 잔액이 모자랍니다.");
           }else if(tem1su <= 0){
              System.out.println(" 재고가 없습니다.");
           }
        }
        if (impo.equals("콜라") || impo.equals("2")) {
           if(tot >= tem2 && tem2su > 0) {
              tot -= tem2;         
              System.out.printf(" %s가 나옵니다.%n", tem22);
              tem2su = tem2su - 1;
           }else if(tot < tem2) {
              System.out.println(" 잔액이 모자랍니다.");
           }else if(tem2su <= 0){
              System.out.println(" 재고가 없습니다.");
           }
        }
        if (impo.equals("커피") || impo.equals("3")) {
           if(tot >= tem3 && tem3su > 0) {
              tot -= tem3;
              System.out.printf(" %s가 나옵니다.%n", tem33);
              tem3su = tem3su - 1;
           }else if(tot < tem3) {
              System.out.println(" 잔액이 모자랍니다.");
           }else if(tem3su <= 0){
              System.out.println(" 재고가 없습니다.");
           }
        }
        if (impo.equals("유자차") || impo.equals("4")) {
           if(tot >= tem4 && tem4su > 0) {
              tot -= tem4;
              System.out.printf(" %s가 나옵니다.%n", tem44);
              tem4su=tem4su-1;
           }else if(tot < tem4) {
              System.out.println(" 잔액이 모자랍니다.");
           }else if(tem4su <= 0){
              System.out.println(" 재고가 없습니다.");
           }
        }            
        }while (!impo.equals("exit") && !impo.equals("20"));
         System.out.println(" 프로그램을 종료 합니다.");
        System.out.printf(" 잔액을 반환 합니다, 반환 금액은 %d 입니다.%n", tot);            
        if (tot > 0) {
           System.out.printf(" 오만원권 %d장, 일만원권 %d장, 오천원권 %d장, 일천원권 %d장,%n 오백원권 %d개, 일백원권 %d개 반환 됩니다.%n", 
                 (tot/50000), (tot%50000)/10000, ((tot%50000)%10000)/5000, (((tot%50000)%10000)%5000)/1000,
                 ((((tot%50000)%10000)%5000)%1000)/500,(((((tot%50000)%10000)%5000)%1000)%500)/100 );
        }
        tot = 0;
	}
}