package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques9_10 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int number = Integer.parseInt(str);
		System.out.println((number % 10 == 0) ? number + "は10の倍数です" : number + "は10の倍数ではありません");
	}

}
