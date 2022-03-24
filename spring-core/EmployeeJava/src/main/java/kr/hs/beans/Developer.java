package kr.hs.beans;

public class Developer implements Employee{
	private int checkin;
	private int checkout;

	public Developer(int in, int out) {
		checkin = in;
		checkout = out;
	}
	public Developer() {
		
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
		System.out.println("개발자 " + checkin + "시 출근");

	}

	public void Checkout() {
		System.out.println("개발자 " + checkout + "시 퇴근");


	}

}
