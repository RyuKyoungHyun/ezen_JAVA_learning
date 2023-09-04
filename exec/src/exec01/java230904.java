package exec01;

public class java230904 {

	public static void main(String[] args) {
		
		
		// 1번 배열길이(7)에 랜덤 수 넣기
			int[] arr = new int[11];
			for (int i =0; i < arr.length; i++ ) {
				arr[i] = (int)(Math.random()*10)+1;
				System.out.printf("%d |", arr[i]);
			}
			
			System.out.println();
			
			// 2번 인덱스가 짝수
			for (int i = 1 ; i < arr.length/2f; i++) {
				System.out.printf("%d |", arr[2*i]);
			}
			
			System.out.println();
			
			// 3번 
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					System.out.printf("%d |", arr[i]);
				}
			}
			System.out.println();	
		/*배열 이동할 때 
		1. 새로운 배열 생성
		2. 데이터 이동
		3. 참조변수 변경
		*/
			
			int[] arr1 = {1,2,3,4,5};
			int[] arr2 = new int[10];
			
	//		for (int i =0; i < arr1.length; i++) {
	//			arr2[i] = arr1[i];
	//		}
			// System.arraycopy();
	//		System.arraycopy(arr1,0,arr2,7,3); // 동일
			arr1 = arr2;
			for (int i= 0; i < arr1.length; i++) {
				System.out.printf("(%d)", arr1[i]);
			}
			System.out.println();
			System.out.println(arr1.length);
		
		
		// score 배열에 100,88,100,100,90;
		// 1. 배열에 저장 / 2. 총합 print / 평균 print
			int total = 0;
			
			int[] score = {100,88,100,100,90};
			for (int i = 0; i < score.length; i++) {
				total += score[i];
			}
			System.out.printf("총합 : %d / 평균 : %3.1f", total, (float)total/score.length);
			
			System.out.println();
			
			// 3번 최대값, 최소값 print하기
			int arr3[] = {79,88,97,33,100,55,90};
			
			int max = arr3[0];// 0
			int min = arr3[0];// 100
			for (int i = 0/*1넣으면 0값이 헛도는거 줄임*/; i < arr3.length; i++) {
				if (arr3[i] > max) {
					max = arr3[i];
				} else if ( arr3[i] < min) {
					min = arr3[i];
				} // else if 빼고 if 두개써도 가능
			}
			System.out.printf("최대값 : %d / 최소값 : %d", max, min);	

			System.out.println();
			// 1. 크기가 10인 numArr의 배열에 0~9까지의 값 저장
			// 2. 배열에 저장된 값이 랜덤하게 섞일 수 있도록 프로그램 작성
			
			// 1.
			int[] numArr = new int[10];
			int temp = 0;
			for (int i =0; i < numArr.length; i++) {
				numArr[i] = i;
			}
			
			for(int i =0; i< 100; i++) {
				// 2. random 변수는 하나만 하고 다른 랜덤변수를 [0]으로 하여도 된다. 섞이건 동일
				// 번호가 중복 안되게 할라면 1~9로 잡기
				int random1 = (int)(Math.random()*10);
				int random2 = (int)(Math.random()*10);
				temp = numArr[random1];
				numArr[random1] = numArr[random2];
				numArr[random2] = temp;
			}
			
			for (int i=0; i <numArr.length; i++) {
				System.out.println(numArr[i]);
			}
			
			// 로또 번호 생성하기
			int[] ball = new int[45];
			//1. ball의 배열에 1~45의 값을 저장하기
			for (int i = 0; i<45; i++) {
				ball[i] = i+1;
			}
			
			int temp2 = 0;
			int j = 0;
			
			for (int i=0; i<6; i++) {
				//2. 0~44까지 임의의 값을 얻는다.
				j = (int)(Math.random()*45);//45-i)+i
				//2. 배열 0부터 5번째까지 모두 바꾼다.
				temp2 = ball[i];
				ball[i] = ball[j];
				ball[j]= temp2;
			}
			
			//3. 물음표 내용 채우기
			for(int i = 0; i <6; i++) {
				System.out.printf("ball[%d] = %d%n",i+1,ball[i]);
			}
			
	}

}
