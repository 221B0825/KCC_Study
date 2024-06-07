package task.queueOrder;

public class Food {
	
	private String foodName;
	private int price;
	
	public Food(String foodName, int price) {
		super();
		this.foodName = foodName;
		this.price = price;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println("음식 이름: " + this.foodName + " , 가격: " + this.price);
	}

}
