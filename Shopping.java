package miniproject2;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Customer cus = new Customer();

		System.out.println("Welcome to Emporia\n");

		Product pro = new Product("shirt", 50, 5);
		Product pro2 = new Product("pants", 300, 3);
		Discount dis = new Discount("shoes", 500, 2);

		dis.discountProduct();

		int pay;

		do {
			System.out.println("1.Buy " + pro.getName() + " for " + pro.getPrice() + " SEK. There are "
					+ pro.getAmount() + " articles\n");
			System.out.println("2.Buy " + pro2.getName() + " for " + pro2.getPrice() + " SEK. There are "
					+ pro2.getAmount() + " articles\n");
			System.out.println("3.Buy " + dis.getName() + " for " + dis.getPrice() + " SEK. There are "
					+ dis.getAmount() + " articles\n");

			System.out.println("4. Finish shopping\n");
			pay = sc.nextInt();

			switch (pay) {

			case 1:
				pro.setSum();
				cus.totalSum(pro.getPrice());
				break;

			case 2:
				pro2.setSum();
				cus.totalSum(pro2.getPrice());
				break;

			case 3:
				dis.setSum();
				cus.totalSum(dis.getPrice());
				break;
			}

		} while (pay != 4);
		System.out.println("You have bought " + cus.articles + " articles. Total sum is " + cus.totalPrice + " SEK.");

	}

}
