package t1_interface5;

public class TeddyBear implements Toy {
	private int age = 0;
	
	@Override
	public void age() {
		System.out.println("모든 연령대가 다 사용할 수 있습니다.");
	}

	@Override
	public void moving() {
		System.out.println("팔/다리를 움직일 수 있습니다.");
	}

	@Override
	public void fire() {}

	@Override
	public void misail() {}

	@Override
	public int possibleAge() {
		return age;
	}
}
