package kr.hs.beans;

public class Publisher implements Employee {
	private int checkin;
	private int checkout;

	public Publisher(int in, int out) {
		checkin = in;
		checkout = out;
	}
	public Publisher() {
	}
	public int getCheckin() {
		return checkin;
	}

	public void setCheckin(int checkin) {
		this.checkin = checkin;
	}

	public int getCheckout() {
		return checkout;
	}
	public void Checkin() {
		System.out.println("ÆÛºí¸®¼Å " + checkin + "½Ã Ãâ±Ù");
	}

	public void Checkout() {
		System.out.println("ÆÛºí¸®¼Å " + checkout + "½Ã Åð±Ù");
	}
}
