package exec01;

public class testClass {

   public static void main(String[] args) {
	   // TODO Auto-generated method stub
	      int a = 1;
	      int b = 1;
	      prac p = new prac();
	      p.count = 4;
	       
	      p.praInstance(p);
	   }

	}

	class prac {

	   int a = 1;
	   int count = 0;

	   void praInstance(prac p) {

	      while(count != 0) {
	         a = a+1000;
	         System.out.println(p.a);
	         count--;
	      }
	   }
	   
	   
	   static int pra(int x) {
	      int result = x +1000;
	      return result;  

	}

}
