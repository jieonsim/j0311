package j0308_abstractEX;

public class WoojuBunsik extends Bonsa {
	
	public WoojuBunsik() {
		super("우주분식", 6000, 7000, 7000, 6000, 1000);
	}

	@Override
	public void kimchi() {
		System.out.println("김치찌개 : " + kimchi);
	}

	@Override
	public void budae() {
		System.out.println("부대찌개 : " + budae);

	}

	@Override
	public void bibimbap() {
		System.out.println("비빔밥 : " + bibimbap);
	}

	@Override
	public void sundae() {
		System.out.println("순대국 : " + sundae);
	}

	@Override
	public void rice() {
		System.out.println("공기밥 : " + rice);
	}
}
