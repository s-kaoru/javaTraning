package question09;

import java.util.Random;

public class Ques9_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int result = new Random().nextInt(4) + 1;
		System.out.println("福引を購入します");
		String str = null;
		switch (result) {
		case 1:
			str = "大当たり";
			break;
		case 2:
			str = "当たり";
			break;
		case 3:
			str = "外れ";
			break;
		case 4:
			str = "大外れ";
			break;
		}
		System.out.println(str);
	}

}
