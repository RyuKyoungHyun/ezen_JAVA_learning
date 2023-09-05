package exec01;

public class java230905 {

	public static void main(String[] args) {
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		
		for(int i = 0; i < score.length; i++) {
			for(int j =0; j < score[i].length; j++) {				
				System.out.printf("score[%d][%d]= %d", i,j,score[i][j]);
			}
		}
		
		/* 다중 배열 출력
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j =0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("score[%d][%d]= %3d | ", i,j,score[i][j]);
			}
			System.out.println();
		}
		System.out.println("합 = " + sum);
		*/
		/* 다중 배열 점수 계산
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("============================");

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			System.out.printf("%2d", i+1);
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("  %3d", score[i][j]);
			}
			System.out.printf("  %3d  %3.1f", sum, (float)sum/score[i].length);
			System.out.println();
		}
		System.out.println("============================");
		System.out.print("총점");
		for (int i =0; i < score[0].length; i++) {
			int sum2 =0;
			for (int j =0; j < score.length; j++) {
				sum2 += score[j][i];
			}
			System.out.printf(" %4d", sum2);
		}
		*/
		
		//배열 문제
				// 5-3
				int[] arr3 = {10,20,30,40,50};
				int sum = 0;
				
				for(int i = 0; i< arr3.length; i++) {
					sum += arr3[i];
				}
				
				System.out.println("sum= "+sum);
				
				//5-4
				int[][] arr4 = {
						{5,5,5,5,5},
						{10,10,10,10,10},
						{20,20,20,20,20},
						{30,30,30,30,30}
				};
				
				int total = 0;
				float average = 0;
				int ar4Leng = 0;
				
				for (int i=0; i<arr4.length; i++) {
					for(int j=0; j<arr4[i].length; j++) {
						total += arr4[i][j];
					}
					ar4Leng += arr4[i].length;
				}
				average = (float)total/ar4Leng;
				
				System.out.println("total="+total);
				System.out.println("average="+average);
				
				//5-5
				int [] ballArr = {1,2,3,4,5,6,7,8,9};
				int [] ball3 = new int[3];
				
				// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
				for (int i =0; i < ballArr.length; i++) {
					int j = (int)(Math.random() * ballArr.length);
					int tmp = 0;
					
					tmp = ballArr[i];
					ballArr[i] = ballArr[j];
					ballArr[j] = tmp;
				}
				
				// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
				System.arraycopy(ballArr, 0, ball3, 0, 3);
				
				for(int i=0; i<ball3.length; i++) {
					System.out.print(ball3[i]);
				}
				System.out.println();
				//5-6
				// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
				int[] coinUnit = {500, 100, 50, 10};
				
				int money = 2680;
				System.out.println("money="+money);
				
				for (int i =0; i<coinUnit.length;i++) {
					System.out.printf("%d원 : %d%n", coinUnit[i], money/coinUnit[i]);
					money = money%coinUnit[i];
				}
				
				//5-7
//				System.out.println(args.length);
//				if(args.length!=1) {
//					System.out.println("USAGE: java Exercise5_7 3120");
//					System.exit(0);
//				}
//				
				// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 에외가 발생한다.
//				int money7 = Integer.parseInt(args[0]);
//				
//				System.out.println("money="+money7);
//				
//				int[] coinUnit7 = {500, 100, 50, 10}; // 동전의 단위
//				int[] coin = {5,5,5,5}; // 단위별 동전의 개수
//				
//				for(int i =0; i<coinUnit.length;i++) {
//					int coinNum = 0;
//					
//					/* 1) 아래의 로직에 맞게 코드를 작성하시오
//					 * 1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
//					 * 2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
//					 * 	(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
//					 * 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
//					 * */
//					//1.
//					coinNum = money7/coinUnit7[i];
//					//2.
//					coinNum = coinNum > coin[i] ? coin[i] : coinNum;
//					coin[i] -= coinNum;
//					//3
//					money7 -= coinNum * coinUnit7[i];
//					System.out.println(coinUnit7[i]+"원: " +coinNum);
//				}
//				
//				if (money7 > 0) {
//					System.out.println("거스름돈이 부족합니다");
//					System.exit(0); //프로그램을 종료한다.
//				}
//				
//				System.out.println("=남은 동전의 개수 =");
//				
//				for (int i =0; i< coinUnit7.length;i++) {
//					System.out.println(coinUnit7[i]+"원:"+coin[i]);
//				}
				
				//5-8
				int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
				int[] counter = new int[4];
				
				for (int i=0; i < answer.length; i++) {
					counter[answer[i]-1] += 1;
				}
				
				for (int i=0; i < counter.length; i++) {
					System.out.printf("%d",counter[i]);
					for(int j=0; j< counter[i]; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
	}

}
