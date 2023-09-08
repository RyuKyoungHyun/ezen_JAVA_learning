package exec01;
import java.util.*;


// 7-1
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i =0; i< CARD_NUM; i++) {
			cards[i] = new SutdaCard (i%10+1,(i == 0 || i == 2 || i == 7 ? true : false));
		}
	}
	void shuffle() {
		SutdaCard temp = new SutdaCard();
		for (int i=0; i< 100; i++) {
			int random = (int)(Math.random()*20);
			temp = cards[0];
			cards[0] = cards[random];
			cards[random] = temp;
		}
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		int random = (int)(Math.random()*20);
		return cards[random];
	}
}
class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	//info() 대신 Object클래스의 toString()를 오버라이딩했다.
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
}

//7-5
class Product {
	int price;
	int bonusPoint;
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv () { super(100);}
//	Tv (int price) { super(price)}
	public String toString() {
		return "Tv";
	}
}

//7-7
class Parent {
	int x = 100;
	Parent () {
		this(200);
	}
	Parent(int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;
	
	Child() {
		this(1000);
	}
	Child(int x) {
		this.x = x;
	}
}
// 7-10
class MyTv2 {
	private boolean isPowerOn;
	int prevChannel = this.channel;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void setChannel(int x) {
		if (MAX_CHANNEL < x || x < MIN_CHANNEL) {
			return;
		}
		prevChannel = x;
		this.channel = x;
	}
	void setVolume(int x) {
		if (MAX_VOLUME < x || x < MIN_VOLUME) {
			return;
		}
		this.volume = x;
	}
	int getChannel() {
		return this.channel;
	}
	int getVolume() {
		return this.volume;
	}
	int gotoPrevChannel() {
		return 1;
	}
}
public class self {	
	
	public static void main(String[] args) {
		
		//7-1
		SutdaDeck deck = new SutdaDeck();

		//7-2
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		//7-1
		for(int i=0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
		
		//7-2
		System.out.println();
		System.out.println(deck.pick(0));

		//7-5
		Tv t = new Tv();
		
		System.out.println();
		
		//7-7
		Child c = new Child();
		System.out.println("x="+c.getX()) ;
		
		//7-10
		MyTv2 m = new MyTv2();
		
		m.setChannel(10);
		System.out.println("Ch:"+m.getChannel());
		m.setVolume(20);
		System.out.println("VOL:"+m.getVolume());
		m.gotoPrevChannel();
		System.out.println("CH:"+m.getChannel());
		m.gotoPrevChannel();
		System.out.println("CH:"+m.getChannel());
	}
}