package question19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ques19_7 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("郵便番号を入力してください。");
		System.out.println("入力例:xxx-xxxx");
		String string = reader.readLine();
		Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
		Matcher matcher = pattern.matcher(string);
		System.out.println(matcher.find());
	}

}
