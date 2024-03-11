package t1_interface3;

public interface Remote {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// (String name)은 제품 이름을 받을 것
	// 전원 온오프
	void switchOn(String name);
	void switchOff(String name);
	
	// 제품 이름 출력
	void remoteName(String name);
	
	// 볼륨 조절
	void setVolume(int volume);
	
}
