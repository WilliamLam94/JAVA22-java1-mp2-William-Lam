package miniproject2;

class Discount extends Product {

	double discount = 0.50;

	Discount(String name, int price, int amount) {
		super(name, price, amount);
	}

	void discountProduct() {
		this.setPrice((int) (this.getPrice() * discount));

	}
}