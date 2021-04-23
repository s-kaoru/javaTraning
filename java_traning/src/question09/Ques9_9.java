package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques9_9 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int number = Integer.parseInt(str);
		System.out.println((number % 2 == 0) ? "number" + "は偶数です" : number + "は奇数です");
	}
}
