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
		System.out.println("�ۺ��� " + checkin + "�� ���");
	}

	public void Checkout() {
		System.out.println("�ۺ��� " + checkout + "�� ���");
	}
}
