package t1_interface2;

public class RemteRun {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Tv tv = new Tv();
		
		audio.switchOn();
		audio.remoteName("audio");
		audio.switchOff();
		System.out.println();
		
		tv.switchOn();
		tv.remoteName("tv");
		tv.switchOff();
		System.out.println();
	}
}
