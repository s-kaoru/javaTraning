package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques9_5 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1 か 2 を入力してください");
		String str = reader.readLine();
		int num = Integer.parseInt(str);
		System.out.println("もう一度 1 か 2 を入力してください");
		String str2 = reader.readLine();
		int num2 = Integer.parseInt(str2);
		if (num == 1 && num2 == 1) {
			System.out.println("1 が 2 回入力されました");
		}
	}
}
