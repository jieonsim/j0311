package exam;

public class Child4 implements LunchMenu {
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
	}

	@Override
	public void seaweedSoup() {
		System.out.print("미역국 ");
	}

	@Override
	public void yogurt() {}

	@Override
	public void banana() {}

	@Override
	public void milk() {}

	@Override
	public void almond() {}

	@Override
	public void totalCost() {
		System.out.println("총 식대 : " + totalCost + "원");
	}
}
