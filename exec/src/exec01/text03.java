package exec01;
import java.util.*;
public class text03 {
	
	public static void main(String[] args) {
		/* 학점 처리
		 * 1. 사용자에게 점수 입력받기
		 * 2. 점수에 따라 학점 부여하기
		 * 3. 사용자가 입력한 점수에 따른 학점 출력하기
		 * 90점 이상 : A학점
		 * 80점 이상 : B학점
		 * 70점 이상 : C학점
		 * 그 이하   : F학점
		 * */		
		
		/* <논리연산자>
		 * || : OR(이거나)
		 * && : AND(이고)
		 * 
		 * */
		
		/*
			int score = 0;
			String grade = "";
			Scanner scan = new Scanner(System.in);
			
			System.out.print("점수를 입력해 주세요 => ");
			score = scan.nextInt();
			
			if (score > 100 || score < 0) {
				grade = "0~100 사이의 숫자로 입력해 주세요";
			} else if (score >= 90) {
				grade = "A학점";
			} else if (score >= 80) {
				grade = "B학점";
			} else if (score >= 70) {
				grade = "C학점";
			} else {
				grade = "F학점";
			}
			
			System.out.print(grade);
		*/
		Scanner scan = new Scanner(System.in);
	      int exam = 0; // 시험점수
	      String grade = null; // 학점
	  
	      System.out.println("시험 점수를 입력하세요: "); // 점수 input 받기
	      exam = scan.nextInt(); // exam에 input 대입
	  
	      if(exam>=90 && exam <=100) {
	         grade = "A";
	      } 
	      if(exam>=80 && exam<90) {
	         grade = "B";
	      }
	      if(exam>=70 && exam<80) {
	         grade = "C";
	      } 
	      if(exam<70) {
	         grade = "D";
	      } 
	      
	      System.out.printf("당신의 시험 점수는 %s 입니다.",grade);
		   
	}
}
