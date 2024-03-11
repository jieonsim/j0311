package t1_interface3;

public class RemoteRun {
	public static void main(String[] args) {
		Product product = new Product();
		product.remoteName("TV");
		product.switchOn("TV");
		product.setVolume(5);
		product.setVolume(15);
		product.setVolume(-5);
		product.switchOff("TV");
		System.out.println("-------------");
		System.out.println();
		
		product.remoteName("audio");
		product.switchOn("audio");
		product.setVolume(8);
		product.setVolume(19);
		product.setVolume(-2);
		product.switchOff("audio");
	}
}
