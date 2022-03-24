package kr.hs.study.beans;

public class Novel implements Book {
	private String name;
	private String book;
	private int price;

	public Novel(String name, String book, int price) {
		this.name = name;
		this.book = book;
		this.price = price;
	}

	public void buy() {
		System.out.println(name + "�� �Ҽ� '" + book + "'�� " + price + "���� ���.");
	}

	public void sell() {
		System.out.println(name + "�� �Ҽ� '" + book + "'�� " + price + "���� �Ǵ�.");
	}

	public void create() {
		System.out.println(name + "�� �Ҽ� 'spring'�� 8000���� �����.");
	}

}
