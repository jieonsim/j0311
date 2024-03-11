package t1_interface5;

import java.util.*;

/*
 	기능		곰돌이	로보트	비행기	탱크
 	움직임	 O		 O		 X		 O
 	레이저	 X		 X		 O		 O
 	미사일	 X		 O		 O		 O
 	연령대	전연령	 4~	     8~	   13세이상
 	
 	장난감 목록을 표시해주고, 해당 장난감의 기능을 보여주세요
 	
 	예시)
 	어떤 장난감 구매를 희망하십니까?
 	1. 곰돌이 2. 로보트 3. 비행기 4. 탱크 0. 종료 ==> 1
 	곰돌이는 팔/다리를 움질일 수 있습니다.
 	곰돌이는 모든 연령대가 사용하실 수 있습니다.
 	
 	구매를 희망하십니까?(Y/N) => Y
 	곰돌이 구매가 확정되었습니다.
 	감사합니다.
 	n일경우 감사합니다. 다음에 또 이용해 주세요. 
 	
 */

public class ToyRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Toy[] toys = { new TeddyBear(), new Robot(), new Airplane(), new Tank() };
		String[] titles = { "곰돌이", "로보트", "비행기", "탱크" };

		System.out.println("어서오세요. 장난감 가게입니다");

		while (true) {
			System.out.println("저희 가게에 있는 장남감 목록은 아래와 같습니다.");

			for (int i = 0; i < titles.length; i++) {
				System.out.println((i + 1) + ". " + titles[i]);
			}

			System.out.print("\n원하는 장난감을 선택해주세요(종료 : 0) : ");
			int choice = sc.nextInt();

			if (choice == 0) {
				break;
			}
			System.out.println("* 장난감 이름 : " + titles[choice - 1] + " * ");
			toys[choice - 1].moving();
			toys[choice - 1].fire();
			toys[choice - 1].misail();
			toys[choice - 1].age();

			System.out.print("\n구매를 희망하십니까? (Y/N) ==> ");
			String ans = sc.next().toUpperCase();

			if (ans.equals("N")) {
				System.out.print("다음에 또 이용해 주세요. ");
				break;
			} else {
				System.out.println(titles[choice - 1] + " 구매가 확정되었습니다.");
			}
		}
		System.out.println("감사합니다.");
		sc.close();
	}
}
