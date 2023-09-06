package exec01;
import java.util.*;

public class self {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		
		pra(a);
		System.out.println(pra(a));
		System.out.println(a);// 1001
		pra(a);
		System.out.println(a);// 2001
		pra(a);
		System.out.println(a);// 3001
	}
	
	
	static int pra(int x) {
		/*
		int result = x +1000;
		return result;
		*/
		return x+= 1000;	
	}
}