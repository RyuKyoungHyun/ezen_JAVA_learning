package exec01;

public class java230907 {

	public static void main(String[] args) {
		class SutdaCard {
			int num;
			boolean isKwang;
			
			SutdaCard () {// 6-1
				this((int)(Math.random()*10)+1/*1로 고정도 가능*/,true);
			}
			SutdaCard (int num, boolean isKwang) {// 6-2
				this.num = num;
				this.isKwang = isKwang;
			}
			
			String info() {
				String a = isKwang ? "K" : "";
				return num + a;
			}
		}
		
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		// 6-3
		class Student {
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
			Student() {
				this("",1,1,0,0,0);
			}
			Student (String name, int ban, int no, int kor, int eng, int math) {
				this.name = name;
				this.ban = ban;
				this.no = no;
				this.kor = kor;
				this.eng = eng;
				this.math = math;
			}
			int getTotal () {
				return kor+ eng+ math;
			}
			float getAverage () {
				return (int)((getTotal()/3f)*10+0.5)/10f;
			}
			String info() {
				return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
			}
		}
		//6-4
		Student s = new Student ();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+ s.name);
		System.out.println("총점:"+ s.getTotal());
		System.out.println("평균:"+ s.getAverage());
		
		//6-5
		Student s5 = new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());
		
		//6-6
		System.out.println(getDistance(1,1,2,2));
		
		//6-7
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));
		
		//6-9
//		class Marine
	}
	static double getDistance(int x, int y, int x1, int y1) {//6-6
		return Math.sqrt(((x-x1)*(x-x1) + (y - y1)*(y - y1)));
	}
	
}
class MyPoint {//6-7
	int x;
	int y;
	
	MyPoint (int x, int y) {
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1) {
		return Math.sqrt(((x-x1)*(x-x1) + (y - y1)*(y - y1)));
	}
	
}