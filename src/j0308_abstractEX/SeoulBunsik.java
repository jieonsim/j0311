package j0308_abstractEX;

public class SeoulBunsik extends Bonsa {

//	public SeoulBunsik(String shopName, int kimchi, int budae, int bibimbap, int sundae, int rice) {
//		super(shopName, kimchi, budae, bibimbap, sundae, rice);
//	}
	
	public SeoulBunsik() {
		super("서울분식", 5000, 5000, 5000, 4000, 0);
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
