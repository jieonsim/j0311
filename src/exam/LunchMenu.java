package exam;

public interface LunchMenu {
	// 필드로 요금 고정
	int RICE = 500;
	int BULGOGI = 2000;
	int TOFU = 1000;
	int SEAWEED_SOUP = 1000;
	int YOGURT = 800;
	int BANANA = 500;
	int MILK = 500;
	int ALMOND = 700;

	// 추상 메소드
	void defaultMeal();			// 기본 메뉴 : 쌀밥과 불고기
	void tofu();
	void seaweedSoup();
	void yogurt();
	void banana();
	void milk();
	void almond();
	void totalCost();			// 식대 출력
}
