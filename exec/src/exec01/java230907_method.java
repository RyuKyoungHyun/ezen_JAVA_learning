package exec01;
import java.util.*;

class out {// 바깥
	static int x;
	int y;
}
public class java230907_method {
	static int z = 1; // 파일 클래스 내부에 작성하고 부르기
	
	
	static int middle(int a) { // 클래스의 static 이용
		a += 1000;
		return a;
	}
	static void middle2(out a) { // 리턴 타입 데이터 이용
		a.y += 1000;
	}
	static int middle3(java230907_method a) { // self 클래스 내부 이용
		a.z += 1000;
		return a.z;
	}
	
	public static void main(String[] args) {
		out out = new out();
		//메인 메소드 안
		int a = 1;
		int b = 1;
		
		// 클래스의 static 이용
		out.x = 1;
		out.x = middle(out.x);
		System.out.println("static 이용 "+out.x);
		out.x = middle(out.x);
		System.out.println("static 이용 "+out.x);
		
		// 리턴 타입 데이터 이용
		out.y = 1;
		middle2(out);
		System.out.println("리턴타입데이터 이용 "+out.y);
		middle2(out);
		System.out.println("리턴타입데이터 이용 "+out.y);
		
		// 파일 클래스 내부에 작성하고 부르기
		java230907_method mi = new java230907_method();
		System.out.println("self 내부 "+ z);
		middle3(mi);
		System.out.println("self 내부 이용 "+ z);
		middle3(mi);
		System.out.println("self 내부 이용 "+ z);
		
		// 대입
		System.out.println("대입 이용 "+ a);
		a = middle(a);
		System.out.println("대입 이용 "+ a);
		a = middle(a);
		System.out.println("대입 이용 "+ a);
	}
}
