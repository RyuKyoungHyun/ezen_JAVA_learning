package exec01;
import java.util.*;

public class java230831 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 연산자 문제모음
		//3번
		System.out.println("--3번-------------");
		int num3 = 10;
		System.out.println(num3>=0?num3==0?0:"양수":"음수");
		
		//4번
		System.out.println("--4번-------------");
		int num4 = 456;
		System.out.println(num4/100*100);
		
		//5번
		System.out.println("--5번-------------");
		int num5 = 333;
		System.out.println(num5/10*10+1);
		
		//6번
		System.out.println("--6번-------------");
		int num6 = 24;
		System.out.println((num6+10)/10*10-num6);//10-num6%10
		
		//7번
		System.out.println("--7번-------------");
		int fahrenheit =100;
		float celcius = (float)5/9*(fahrenheit -32);// 5/9f-(fahrenheit - 32)
		celcius = celcius*1000%10 >=5 ? (int)(celcius*100+1)/(float)100: (int)(celcius*100)/(float)100;
		// (int)(celicus * 100 +0.5)/100f
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		//8번
		System.out.println("--8번-------------");
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		
		char ch = 'A';
		ch = (char)(ch + 2);
		
		float f = (float)3 / 2;
		long l = 3000 * 3000 * 3000;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		//9번
		System.out.println("--9번-------------");
		char ch9 = 'z';
		boolean b9 =  '0' <= ch9 && ch9 <= '9'  || 'A' <= ch9 && ch9 <= 'Z' || 'a' <= ch9 && ch9 <= 'z';
		
		System.out.println(b9);
	
		//10번
		System.out.println("--10번-------------");
		char ch10 = 'A';
		
		char lowerCase = ch10 <='A' ? (char)(ch10+32) : ch10;
		
		System.out.println("ch:"+ch10);
		System.out.println("lowercase:"+lowerCase);
		
	}
}