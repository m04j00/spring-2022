package kr.hs.study.beans;

public class Magazine implements Book {
	private String name;
	private String book;
	private int price;

	public Magazine(String name, String book, int price) {
		this.name = name;
		this.book = book;
		this.price = price;
	}

	public void buy() {
		System.out.println(name + "의 잡지 '" + book + "'을 " + price + "원에 산다");
	}

	public void sell() {
		System.out.println(name + "의 잡지 '" + book + "'을 " + price + "원에 판다.");
	}

	public void create() {
		System.out.println(name + "의 잡지를 쓴다.");
	}
}