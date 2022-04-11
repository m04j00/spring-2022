package kr.hs.study.beans;

public class BookInfo {
	private String name;
	private String book;
	private int price;
	
	public BookInfo(String name, String book, int price) {
		this.name = name;
		this.book = book;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getBook() {
		return book;
	}

	public int getPrice() {
		return price;
	}
	
}
