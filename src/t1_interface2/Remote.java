package t1_interface2;

public interface Remote {
	// 인터페이스 필드 | 타입 앞에 public static final 생략 가능
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드 | 반환 타입 앞에 public abstract 생략 가능
	void switchOn();
	void switchOff();
	
	void remoteName(String name);
}
