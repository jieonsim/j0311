package t1_interface6;

public class Actor implements Police, Fireman, Chief {

	@Override
	public void pizza() {
		System.out.println("피자를 만들 수 있습니다.");
	}

	@Override
	public void spaghetti() {
		System.out.println("피자를 만들 수 있습니다.");
	}

	@Override
	public void fire() {
		System.out.println("화재를 진압할 수 있습니다.");
	}

	@Override
	public void save() {
		System.out.println("인명 구조를 할 수 있습니다.");
	}

	@Override
	public void catching() {
		System.out.println("범인을 잡을 수 있습니다.");
	}

	@Override
	public void searching() {
		System.out.println("물건을 찾아줄 수 있습니다.");
	}

}
