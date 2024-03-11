package j0308_abstractEX;

public abstract class Bonsa {
	// 필드 생성
	public String shopName;
	public int kimchi;
	public int budae;
	public int bibimbap;
	public int sundae;
	public int rice;
	
	// 생성자 생성
	public Bonsa(String shopName, int kimchi, int budae, int bibimbap, int sundae, int rice) {
		this.shopName = shopName;
		this.kimchi = kimchi;
		this.budae = budae;
		this.bibimbap = bibimbap;
		this.sundae = sundae;
		this.rice = rice;
	}
	
	// 추상 메소드 생성
	public abstract void kimchi();
	public abstract void budae();
	public abstract void bibimbap();
	public abstract void sundae();
	public abstract void rice();
	
	// 일반 메소드 생성
	public void getShopName() {
		System.out.println("점포명 : " + shopName);
	}
}
