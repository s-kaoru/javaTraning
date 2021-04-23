package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques9_6 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1 か 2 を入力してください");
		String str = reader.readLine();
		int num = Integer.parseInt(str);
		if (num == 1 || num == 2) {
			System.out.println("1 か 2 が入力されました");
		}
	}

}
