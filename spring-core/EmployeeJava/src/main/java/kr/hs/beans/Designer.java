package kr.hs.beans;

public class Designer implements Employee {
	private int checkin;
	private int checkout;

	public Designer(int in, int out) {
		checkin = in;
		checkout = out;
	}

	public Designer() {
		
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

	public void setCheckout(int checkout) {
		this.checkout = checkout;
	}

	public void Checkin() {
		System.out.println("�����̳� " + checkin + "�� ���");

	}

	public void Checkout() {
		System.out.println("�����̳� " + checkout + "�� ���");


	}

}
