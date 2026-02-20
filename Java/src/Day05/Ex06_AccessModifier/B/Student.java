package Day05.Ex06_AccessModifier.B;

import Day05.Ex06_AccessModifier.A.Person;

public class Student extends Person {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
		// TODO Auto-generated constructor stub
	}
	
	// 메소드
	public void defaultSetting() {
		name = "이름없음";		// public,		모든 곳에서 접근 가능
		age = 20;				// protected,	다른 패키지이지만 Person 상속받아서 접근 가능
//		height = 170;			// default, 	같은 패키지가 아니라서 접근 불가
//		weight = 60;			// private		해당 클래스에서만 접근 가능
		setHeight(170);
		setWeight(60);
	}
}
