package t1_interface2;

public class RemteRun2 {
	public static void main(String[] args) {
// 		부모인 Remote 타입으로 받아도 된다. 타입이 같으면 배열도 사용 가능하게 된다.
//		Remote audio = new Audio();
//		Remote tv = new Tv();
		
		Remote[] remotes = {new Audio(), new Tv()};
		String[] titles = {"Audio", "TV"};
		
		for(int i = 0; i < remotes.length; i++) {
			remotes[i].switchOn();
			remotes[i].remoteName(titles[i]);
			remotes[i].switchOff();
			System.out.println();
		}
		
//		audio.switchOn();
//		audio.remoteName("audio");
//		audio.switchOff();
//		System.out.println();
//		
//		tv.switchOn();
//		tv.remoteName("tv");
//		tv.switchOff();
//		System.out.println();
	}
}
