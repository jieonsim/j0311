package exam;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		LunchMenu[] lunchMenus = { new Child1(), new Child2(), new Child3(), new Child4(), new Child5() };
		String[] names = { "짱구", "철수", "유리", "훈이", "맹구" };

		while (true) {
			System.out.println("식단표 및 식대 확인이 필요한 원생의 번호를 입력해주세요.");
			System.out.print("1. 짱구 | 2. 철수 | 3. 유리 | 4. 훈이 | 5. 맹구 | 6. 종료 ▶ ");
			int choice = scanner.nextInt();

			if (choice == 6) {
				break;
			}

			if (choice <= 0 || choice >= 7) {
				System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요.\n");
				continue;
			}

			System.out.println("\n원생 이름 : " + names[choice - 1]);
			System.out.print("점심 식단 : ");
			lunchMenus[choice - 1].defaultMeal();
			lunchMenus[choice - 1].tofu();
			lunchMenus[choice - 1].seaweedSoup();
			lunchMenus[choice - 1].yogurt();
			lunchMenus[choice - 1].banana();
			lunchMenus[choice - 1].milk();
			lunchMenus[choice - 1].almond();
			System.out.println();
			lunchMenus[choice - 1].totalCost();
			System.out.println();
		}
		System.out.println("\n종료되었습니다. 감사합니다.");
		scanner.close();
	}
}
