package by.oks.jb29.les12.task03.logic;

import java.util.Random;

import by.oks.jb29.les12.task03.bean.Bouquet;
import by.oks.jb29.les12.task03.bean.Rose;

public class OrderBouquet {
	private Bouquet bouquet;

	public Bouquet getBouquet() {
		return bouquet;
	}

	public OrderBouquet() {
		bouquet = new Bouquet();
	}

	public int bouquetPrice(Bouquet bouquet) {
		bouquet.setPrice(
				bouquet.getPrice() + (bouquet.getFlowers().size()) * bouquet.getFlowers().get(0).getPrice());

		return bouquet.getPrice();
	}

	public Bouquet createBouquet(String flowerName) {

		Random rand = new Random();

		int quantityOfFlowers = 1 + rand.nextInt(15);
		if (quantityOfFlowers % 2 == 0) {
			quantityOfFlowers++;
		}

		switch (flowerName) {
		case "Розы":
			while (quantityOfFlowers > 0) {
				bouquet.addFlower(
						new Rose("Роза", "Россия", rand.nextInt(100), rand.nextInt(15), 100 + rand.nextInt(50)));
				quantityOfFlowers--;
			}

		case "Орхидеи":
			while (quantityOfFlowers > 0) {
				bouquet.addFlower(
						new Rose("Орхидея", "Нидерланды", rand.nextInt(90), rand.nextInt(10), 40 + rand.nextInt(20)));
				quantityOfFlowers--;
			}

		case "Пионы":
			while (quantityOfFlowers > 0) {
				bouquet.addFlower(
						new Rose("Пионы", "Нидерланды", rand.nextInt(120), rand.nextInt(17), 30 + rand.nextInt(20)));
				quantityOfFlowers--;
			}
		}

		bouquetPrice(bouquet);

		return bouquet;
	}
}
