package kr.hs.study.beans;

public class Person {
	String name;
	int age;
	String eat;
	
	public Person(String name, int age, String eat) {
		this.name = name;
		this.age = age;
		this.eat = eat;
	}

	public void eat() {
		System.out.println(name + ", " + age + ", " + eat + "ธิดู");
	}
}
