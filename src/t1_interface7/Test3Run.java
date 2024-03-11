package t1_interface7;

// 같은 패키지 안에 같은 이름의 클래스가 존재할 수가 없다
interface Aa2 {
	static void abc() {
		System.out.println("여기는 Aa2 인터페이스의 정적 메소드 abc()이다.");
	}
	
	
}
public class Test3Run {
	public static void main(String[] args) {
		// 정적 메소드 호출
		Aa2.abc();
	}
}
