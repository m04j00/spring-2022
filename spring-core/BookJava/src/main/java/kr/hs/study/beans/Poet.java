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
		System.out.println(name + "의 시 '" + book + "'를 " + price + "원에 산다.");
	}

	public void sell() {
		System.out.println(name + "의 시 '" + book + "'를 " + price + "원에 판다.");
	}

	public void create() {
		System.out.println(name + "가 시를 짓는다.");
	}
}
