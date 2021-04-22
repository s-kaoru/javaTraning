package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques06_02 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int i = Integer.parseInt(str);
		System.out.println("今年で"+i+"歳になります");

	}
}
