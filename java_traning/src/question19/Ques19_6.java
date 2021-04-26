package question19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ques19_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日(E)HH:MM:SS秒");
		System.out.println("今日の日付を表示します");
		System.out.println(simpleDateFormat.format(date));
	}
}
