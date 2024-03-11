package t1_interface1;

public class Seoul implements Test1 {
	int max;
	// 추상 메소드만 불러왔고 일반 메소드는 안부름
	
	@Override
	public void data() {
		System.out.println("이곳은 Seoul 클래스의 data 메소드");
	}

	@Override
	public void data2() {
		System.out.println("이곳은 Seoul 클래스의 data2 메소드");
		
	}

	@Override
	public void data1(int su) {
		if(su > MAX) {
			max = su;
		} else {
			max = MAX;
			System.out.println("최대값 : " + max);
		}
	}	
}
