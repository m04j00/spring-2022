package kr.hs.study.beans;

public class TestBean3 {
	private DataBean3 data3;
	private DataBean3 data4;

	public TestBean3(DataBean3 data3, DataBean3 data4) {
		System.out.println("TestBean3�� �Ű����� 2���� ������");
		this.data3 = data3;
		this.data4 = data4;
		System.out.println("data3 : " + data3);
		System.out.println("data4 : " + data4);
	}

}
