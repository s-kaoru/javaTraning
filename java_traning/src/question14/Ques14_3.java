package question14;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ques14_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double radius = 4;
		Circle circle = new Circle();
		radius = circle.circleCalc(radius);
		String ciString = String.valueOf(radius);
		BigDecimal bd = new BigDecimal(ciString);
		BigDecimal bd2 = bd.setScale(2, RoundingMode.HALF_DOWN);
		System.out.println(radius);
		System.out.println(ciString);
		System.out.println("円の面積は" + bd2 + "です");

	}

}
