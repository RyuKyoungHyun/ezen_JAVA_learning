package exec01;
import java.util.*;

public class test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		// <계산기 만들기>		
		double a = 0;
		double b = 0;
		double temp = 0;
		double result = 0;
		String result3 = "";
		String c = "";
		
		System.out.print("숫자를 입력해주세요 => ");
		a = scan.nextInt();
		System.out.printf("숫자1 : %f %n", a);
		
		System.out.print("숫자를 입력해주세요 => ");
		b = scan.nextInt();
		System.out.printf("숫자2 : %f %n", b);
		
		System.out.printf("원하시는 연산자를 골라주세요. %n '더하기','빼기','곱하기','나누기' 중에서 입력해 주세요. %n");
		c = scan.next();
		
		if (c.equals("더하기")) {
			result = a+b;
		} else if (c.equals("빼기")) {
			if (a < b) {
				temp = a;
				a = b;
				b = temp;
			}
			result = a-b;
		} else if (c.equals("곱하기")) {
			result = a*b;
		} else if (c.equals("나누기")) {
			result = a/(double)b;
		} else {
			result3 = "정해진 연산자 중에서 골라주세요.";
		}
		
		System.out.printf("연산결과 : %f%s %n", result, result3);
		
		
		// <학점 처리>		
		int score = 0;
		String grade = "";
		String add = "";
		System.out.printf("사용자의 점수를 입력해 주세요 => ");
		score = scan.nextInt();
		
		if (100 < score || score < 0) {
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70){
			grade = "C";
		} else {
			grade = "F";
		}
		
		if (100 >= score && score >= 70) {
			if ((score % 10) >= 7 || score == 100 ) {
				add = "+";
			}	
		}
		
		System.out.printf("점수 : %d / 학점 : %s%s", score, grade, add);
		*/
		
		/*
//		학점계산기 (주신 소스)
//	      Scanner scan = new Scanner(System.in);
	      System.out.println("학점계산기");
	      System.out.print("이름 :");
	      String name = scan.next();
	      System.out.print("과목 :");
	      String subject = scan.next();
	      System.out.print("점수 :");
	      int score = scan.nextInt();
	      int a = score % 10;
	      String msg = "";
	      
	      
	      if (score>=90) {
	    	  msg="A";
	      }
	      else if (score>=80) {msg="B";}
	      else if (score>=70) {msg="C";}
	      else {msg="F";}

	      if (a>6&&score>=70 || score == 100) {
	    	  msg = msg+"+";
	      }
	      
	      System.out.printf(name+ " 님의 " +subject+ " 학점은 " +msg+" 입니다.");
	     
		 */
		
		// 사과 바구니 세기
		int numOfApples = 151; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket==0?0:1); // 모든 사과를 담는데 필요한 바구니의 수
		
		/*
		if (numOfApples / sizeOfBucket > 0) {
			numOfBucket = (numOfApples / sizeOfBucket) +1;
		} else {
			numOfBucket = (numOfApples / sizeOfBucket);
		}
		*/
		
		// numOfBucket = (numOfApples % sizeOfBucket) > 0 ? (numOfApples / sizeOfBucket) +1 : (numOfApples / sizeOfBucket);
		
		System.out.println("필요한 바구니의 수 : " +numOfBucket);
		
		int num = 0;
		String numType = "";
		System.out.print("숫자를 입력해 주세요. => ");
		num = scan.nextInt();
		
		if (num % 2 == 0) {
			numType = "짝";
		} else {
			numType = "홀";
		}
		
		// numType = num % 2 == 0 ? "짝" : "홀";
		
		System.out.printf("%d : %s수", num, numType);
	}
	
}
