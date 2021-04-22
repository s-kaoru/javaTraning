package question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques07_07 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数値を入力:");
		String str = reader.readLine();
		int i=Integer.parseInt(str);
		i=(int)(i*0.7);
		System.out.println("3割引で"+i+"です");
	}

}
