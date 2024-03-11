package t1_interface5;

public class Fireman implements Action {

	@Override
	public void catching() {}

	@Override
	public void searching() {}

	@Override
	public void fire() {
		System.out.println("화재를 진압합니다.");
	}

	@Override
	public void save() {
		System.out.println("인명 구조를 합니다.");
	}

	@Override
	public void pizza() {}

	@Override
	public void spaghetti() {}

//	@Override
//	public void action(String action) {
//		System.out.println(action + "의 역할 : ");
//	}

}
