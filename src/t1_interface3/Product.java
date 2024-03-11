package t1_interface3;

public class Product implements Remote {
	int volume; // 4라인 volume은 필드

	@Override
	public void switchOn(String name) {
		System.out.println(name + " 전원을 켭니다.");
	}

	@Override
	public void switchOff(String name) {
		System.out.println(name + " 전원을 끕니다.");
	}

	@Override
	public void remoteName(String name) {
		System.out.println("선택하신 제품은 " + name);
	}

	@Override
	public void setVolume(int volume) { // 22라인 volume은 매개변수
		System.out.println("입력한 볼륨 : " + volume);
		if (volume > MAX_VOLUME) {
			System.out.println("최대 볼륨은 10입니다.");
			volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			System.out.println("최소 볼륨은 0입니다.");
			volume = MIN_VOLUME;
		}
		System.out.println("현재 볼륨 : " + volume);
		System.out.println();
	}
}
