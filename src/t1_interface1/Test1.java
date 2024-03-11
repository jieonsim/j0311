package t1_interface1;

public interface Test1 {
	int MAX = 1000000;
	int MIN = 0;
	// int 앞에 public static final 생략
	// 필드는 상수이기 때문에 변수명은 대문자로
	
	// 추상메소드      void 앞에 public abstract 생략
	void data();
	void data1(int su);
	void data2();
	
	
	default void data3() {
		// default 메소드는 실행 블록이 있어야함		
		System.out.println("이곳은 data3 메소드(default)");
	}
	
	static void data4() {
		// static(정적) 메소드 또한 실행 블록이 있어야함
		System.out.println("이곳은 data4 메소드 (static)");
	}
}
