package exec01;

public class java230901 {

	public static void main(String[] args) {
		// 배열
		
		// 선언 : int[] score; 메모리만!
		// 생성 : score = new intp[길이]; 공간도 생성
		
		int[] score = new int[5];
		// 타입[] 참조변수 = 생성(new) 타입[길이]
		System.out.println(score);

		
		/* 배열 예제 1
		int[] score = new int[4];
		
		for (int i = 0; i < 4; i++) {
			score[i] = i+1;
			System.out.print(score[i]);
		}
		*/
		
		// 배열에 랜덤 숫자 저장&출력
			int[] Arr = new int[7];
			
			for (int i =0; i < 7; i++) {
				Arr[i] = (int)(Math.random()*10)+1;
				System.out.printf("%d | ", Arr[i]);
				
			}
			
			System.out.println();
			// 인덱스짝수
			for (int i =2; i <7; i+=2) {
				System.out.printf("%d | ", Arr[i]);
			}
			
			System.out.println();
			// 값이 짝수
			for (int i= 0; i <7; i++) {
				if (Arr[i] %2 == 0) {
					System.out.printf("%d | ", Arr[i]);
				}
			}
	}
}