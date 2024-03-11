package t1_interface5;

/*
 	각 배우의 역할 출려하기
 	배역 : 경찰관(범인찾기, 물건찾기) , 소방관(화재진압, 인명구조) , 요리사(피자/스파게티 만들기)
 */

public class ActionRun {
	public static void main(String[] args) {
		System.out.println("* 각 역할극의 메뉴얼 리스트 *");

		String[] actors = { "경찰관", "소방관", "요리사" };
		Action[] actions = { new Police(), new Fireman(), new Chief() };
		
		for(int i = 0; i < actions.length; i++) {
			actions[i].action(actors[i]);
			actions[i].catching();
			actions[i].searching();
			actions[i].fire();
			actions[i].save();
			actions[i].pizza();
			actions[i].spaghetti();			// 각 역할에 해당하는 동작만 출력될 것임
			System.out.println();
			
		}
	}
}
