package t1_interface7;

public class Test2Run {
	public static void main(String[] args) {
//		new Test2();	인터페이스를 생성하려면 익명 구현 객체를 사용해서 가능

		// 익명 구현 객체 구현할 메소드를 만들어준다
		Test2 t22 = new Test2() {
			int atom = 200;
			
			@Override
			public void abc() { // 익명 구현 객체 안에 익명 구현 메소드 public 필수
				int temp = atom;
				System.out.println("이곳은 Test2Run 클래스의 t22 익명 객체 안의 abc() 메소드입니다.");
			}
		};

		Test2 t23 = new Test2() {
			public void abc() {
				System.out.println("이곳은 Test2Run의 클래스의 t23 익명 객체 안의 abc() 메소드입니다.");
			}
		};
		
		// 익명 개체 안의 메소드 호출하기
		t22.abc();
//		인터페이스 변수로 익명 객체 안의 필드와 일반 변수에 접근 불가하다
//		System.out.println("atom : " + t22.atom);
//		System.out.println("temp : " + t22.atom().temp); 
		t23.abc();
		
		if (t22 == t23) {
			System.out.println("같은 객체를 가리킵니다.");
		} else {
			System.out.println("서로 다른 객체를 가리킵니다.");
		}
	}
}
