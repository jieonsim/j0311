package t1_interface5;

public class Chief implements Action {

	@Override
	public void catching() {}

	@Override
	public void searching() {}

	@Override
	public void fire() {}

	@Override
	public void save() {}

	@Override
	public void pizza() {
		System.out.println("피자를 만듭니다.");
	}

	@Override
	public void spaghetti() {
		System.out.println("스파게티를 만듭니다.");
	}

//	@Override
//	public void action(String action) {
//		System.out.println(action + "의 역할 : ");
//	}
}
