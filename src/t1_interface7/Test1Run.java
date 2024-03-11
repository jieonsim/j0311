package t1_interface7;

interface Aa {	// 인터페이스
	int AA = 10;
	void abc();
}

class Bb implements Aa {	// Aa 인터페이스를 상속받는 구현 클래스
	@Override
	public void abc() {
		System.out.println("Bb 클래스의 abc() 메소드");
	}
}

class Cc implements Aa {	// Aa 인터페이스를 상속받는 구현 클래스
	@Override
	public void abc() {
		System.out.println("Cc 클래스의 abc() 메소드");
	}
}

public class Test1Run {	// 실행 클래스
	public static void main(String[] args) {
//		Bb b1 = new Bb();
//		Bb b2 = new Bb();
//		Cc c1 = new Cc();
//		Cc c2 = new Cc();
		
		// 구현 객체 생성
		Aa b1 = new Bb();
		Aa b2 = new Bb();
		Aa c1 = new Cc();
		Aa c2 = new Cc();
		
		// 구현 객체 안의 메소드 호출
		b1.abc();
		b2.abc();
		c1.abc();
		c2.abc();
	
	}
}
