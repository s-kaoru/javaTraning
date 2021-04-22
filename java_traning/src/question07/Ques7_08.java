package question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques7_08 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();
		String str2 = reader.readLine();
		String str3 = reader.readLine();
		int i1 = Integer.parseInt(str1);
		int i2 = Integer.parseInt(str2);
		int i3 = Integer.parseInt(str3);
		i1 = (int) (i1 * 0.7);
		i2 = (int) (i2 * 0.7);
		i3 = (int) (i3 * 0.7);
		int sum = i1 + i2 + i3;

		System.out.println("合計" + sum + "円");
		System.out.println("平均" + (sum / 3) + "円");
	}

}
