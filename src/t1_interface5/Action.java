package t1_interface5;

public interface Action {
	// 경찰관 (범인잡기, 물건찾기)
	void catching();
	void searching();
	
	// 소방관(화재진압, 구조하기)
	void fire();
	void save();
	
	// 요리사(피자, 스파게티를 만든다)
	void pizza();
	void spaghetti();
	
	// 역할명
	default void action(String action) {
		System.out.println(action + "의 역할 : ");
	}
	// 인터페이스는 원래 추상 메소드가 아닌 메소드는 생성이 불가하지만 default 메소드로는 생성 가능
	// default 메소드는 자바8부터 가능ac
	
	
	// 인터페이스는 실행 블록이 있으면 안된다.
}
