package exam;

/*
 	문제 : 어린이집 아이들의 식대 계산 프로그래밍
 	
 	어린이집에 어린이들의 점심 식대 관련하여 프로그래밍한다
 	어린이들은 점심으로 쌀밥 불고기 두부조림 미역국이 배식된다
 	추가로 요플레 바나나 우유 아몬드가 간식으로 배식된다
 	
 	기본적인 쌀밥 불고기는 모든 아이들이 먹는다
 	하지만 개인 체질에 따라서 간식은 선택할 수가 있다
 	특히 알레르기가 있는 아이들은 간식을 전부 선택하지 않을 수도 있다
 	식대를 계산하는 클래스를 설계해보자
 	
 	계산 : 추상메소드로 오버라이딩 할 것
 	가격표 : static final field로 고정
 */
public interface LunchMenu {
	int RICE = 500;
	int BULGOGI = 2000;
	int TOFU = 1000;
	int SEAWEED_SOUP = 1000;
	int YOGURT = 800;
	int BANNA = 500;
	int MILK = 500;
	int AMOND = 700;
	
	void defaultMenuCalculate();
	
	

}
