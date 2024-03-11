package j0308_abstractEX;

public class BunsikRun2 {
	public static void main(String[] args) {
//		WangjaBunsik wangjaBunsik = new WangjaBunsik();
//		SeoulBunsik seoulBunsik = new SeoulBunsik();
//		WoojuBunsik woojuBunsik = new WoojuBunsik();
		
		// Bonsa로 업캐스팅
//		Bonsa wangjaBunsik = new WangjaBunsik();
//		Bonsa seoulBunsik = new SeoulBunsik();
//		Bonsa woojuBunsik = new WoojuBunsik();
//		
//		Bonsa[] bonsas = {wangjaBunsik, seoulBunsik, woojuBunsik};
//		위 내용을 별도 업캐스팅 안하고 아래와 같이 할 수 있음		
		
		Bonsa[] bonsas = {new WangjaBunsik(), new SeoulBunsik(), new WoojuBunsik()};
		for(int i = 0; i < bonsas.length; i++) {
			bonsas[i].getShopName();
			bonsas[i].kimchi();
			bonsas[i].budae();
			bonsas[i].bibimbap();
			bonsas[i].sundae();
			bonsas[i].rice();
			System.out.println("==============");
		}
		
		/*
		wangjaBunsik.getShopName();
		wangjaBunsik.kimchi();
		wangjaBunsik.budae();
		wangjaBunsik.bibimbap();
		wangjaBunsik.sundae();
		wangjaBunsik.rice();
		System.out.println("=============================");
		
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibimbap();
		seoulBunsik.sundae();
		seoulBunsik.rice();
		System.out.println("=============================");
		
		woojuBunsik.getShopName();
		woojuBunsik.kimchi();
		woojuBunsik.budae();
		woojuBunsik.bibimbap();
		woojuBunsik.sundae();
		woojuBunsik.rice();
		System.out.println("=============================");		
		*/
	}
}
