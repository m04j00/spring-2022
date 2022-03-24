package kr.hs.study.beans;

public class Poet implements Book {
	private String name;
	private String book;
	private int price;

	public Poet(String name, String book, int price) {
		this.name = name;
		this.book = book;
		this.price = price;
	}

	public void buy() {
		System.out.println(name + "�� �� '" + book + "'�� " + price + "���� ���.");
	}

	public void sell() {
		System.out.println(name + "�� �� '" + book + "'�� " + price + "���� �Ǵ�.");
	}

	public void create() {
		System.out.println(name + "�� �ø� ���´�.");
	}
}
