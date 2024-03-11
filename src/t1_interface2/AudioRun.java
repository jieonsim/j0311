package t1_interface2;

public class AudioRun {
	public static void main(String[] args) {
		// 추상클래스나 인터페이스는 생성 불가, 실체 클래스로 생성해야 함
		Audio audio = new Audio();
		
		System.out.println("Audio 최대 볼륨 : " + audio.MAX_VOLUME);
		System.out.println("Audio 최소 볼륨 : " + audio.MIN_VOLUME);
		System.out.println();
		
		audio.switchOn();
		audio.remoteName("Audio");
		audio.switchOff();
	}
}
