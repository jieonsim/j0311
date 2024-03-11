package j0308_abstractEX;

public class BunsikRun {
	public static void main(String[] args) {
		WangjaBunsik wangjaBunsik = new WangjaBunsik();
		wangjaBunsik.getShopName();
		wangjaBunsik.kimchi();
		wangjaBunsik.budae();
		wangjaBunsik.bibimbap();
		wangjaBunsik.sundae();
		wangjaBunsik.rice();
		System.out.println("=============================");
		
		SeoulBunsik seoulBunsik = new SeoulBunsik();
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibimbap();
		seoulBunsik.sundae();
		seoulBunsik.rice();
		System.out.println("=============================");
		
		WoojuBunsik woojuBunsik = new WoojuBunsik();
		woojuBunsik.getShopName();
		woojuBunsik.kimchi();
		woojuBunsik.budae();
		woojuBunsik.bibimbap();
		woojuBunsik.sundae();
		woojuBunsik.rice();
		System.out.println("=============================");		
	}
}
