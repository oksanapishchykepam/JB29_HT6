package by.oks.jb29.les12.task03.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bouquet {
	private List<Flower> flowers;
	private List<Packaging> decor;

	private int price;

	public Bouquet() {
		this.flowers = new ArrayList<Flower>();
		this.decor = new ArrayList<Packaging>();
	}

	public void addFlower(Flower fl) {
		flowers.add(fl);
	}

	public void addPackaging(String name, String type, int price, String color) {
		switch (name) {
		case "Обёртка":
			decor.add(new Wrapper(type, price, color));
			this.price += price;
			break;

		case "Лента":
			decor.add(new Tape(price, color));
			this.price += price;
			break;
		}
	}

	public void giveABouquet() {
		String decor = "";
		Iterator<Packaging> it = this.decor.iterator();

		while (it.hasNext()) {
			decor = decor + ", " + it.next().getName();
		}

		System.out.println("Букет: " + flowers.get(0).getName() + ", упаковка: " + decor);
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	public List<Packaging> getDecor() {
		return decor;
	}

	public void setDecor(List<Packaging> decor) {
		this.decor = decor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Букет: " + flowers.get(0).getName() + ", " + (flowers.size() + 1) + "шт., упаковка: " + decor
				+ ", цена = " + price + ".";
	}

}