package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques9_8 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1 を入力してください");
		String str1 = reader.readLine();
		int num = Integer.parseInt(str1);
		System.out.println((num == 1) ? "1 が入力されました" : "1 以外が入力されました");
	}
}
