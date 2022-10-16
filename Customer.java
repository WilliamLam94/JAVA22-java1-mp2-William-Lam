package miniproject2;

class Customer {

	int totalPrice;
	int articles;

	void totalSum(int price) {

		this.totalPrice = this.totalPrice + price;
		this.articles = this.articles + 1;

	}

}
