package miniproject2;

class Product {

	private String name;
	private int price;
	private int amount;

	Product(String name, int price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	void setSum() {
		this.amount = this.amount - 1;
	}

	String getName() {
		return name;

	}

	int getPrice() {
		return price;

	}

	void setPrice(int price) {
		this.price = price;

	}

	int getAmount() {
		return amount;

	}

	void setAmount(int amount) {
		this.amount = amount;

	}
}
