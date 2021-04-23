package question10;

public class Ques10_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < 8; i++) {
			for (int j = 8; i < j; j--) {
				System.out.print("　");
			}
			for (int j = 1; j <= 2 * (i + 1) - 1; j++) {
				if (i % 2 == 0) {
					System.out.print("■");
				} else {
					System.out.print("□");
				}
			}
			System.out.println();
		}

	}

}
