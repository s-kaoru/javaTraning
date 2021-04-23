package question13;

class Dog {
	public void showName(String str) {
		System.out.println("名前は" + str + "です");
	}

	public void showAge(int age) {
		System.out.println("年齢は" + age + "歳です");

	}

	public void showProfile(int age, String fav) {
		System.out.println("年齢は" + age + "歳、"
				+ "好きな食べ物は" + fav + "です。");
	}
}
