package ex3._3;

public class Item {
	private int price;
	private String name;

	void setPrice(int price) {
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	void setName(String name) {
		this.name = name;
	}

	void printItenInfo() {
		System.out.println(name + "の価格は、" + price + "円です");
	}
}
