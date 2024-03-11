package exam;

public class Child3 implements LunchMenu {
	int totalCost;

	@Override
	public void defaultMeal() {
		System.out.print("쌀밥 ");
		System.out.print("불고기 ");
		totalCost += RICE + BULGOGI;
	}

	@Override
	public void tofu() {
		System.out.print("두부조림 ");
		totalCost += TOFU;
	}

	@Override
	public void seaweedSoup() {}

	@Override
	public void yogurt() {
		System.out.print("요거트 ");
		totalCost += YOGURT;
	}

	@Override
	public void banana() {
		System.out.print("바나나 ");
		totalCost += BANANA;
	}

	@Override
	public void milk() {}

	@Override
	public void almond() {}

	@Override
	public void totalCost() {
		System.out.println("총 식대 : " + totalCost + "원");
	}
}
