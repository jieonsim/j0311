package exam;

public class Child2 implements LunchMenu {
	int totalCost;

	@Override
	public void defaultMeal() {
		System.out.print("쌀밥 ");
		System.out.print("불고기 ");
		totalCost += RICE + BULGOGI;
	}

	@Override
	public void tofu() {}

	@Override
	public void seaweedSoup() {}

	@Override
	public void yogurt() {}

	@Override
	public void banana() {}

	@Override
	public void milk() {
		System.out.print("우유 ");
		totalCost += MILK;
	}

	@Override
	public void almond() {
		System.out.print("아몬드 ");
		totalCost += ALMOND;
	}

	@Override
	public void totalCost() {
		System.out.println("총 식대 : " + totalCost + "원");
	}
}
