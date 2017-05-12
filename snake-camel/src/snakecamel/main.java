package snakecamel;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("スネークケースの文字列をキャメルケースに変換");
		String s=in.next();
		System.out.println(s+"→"+SnakeCamelUtil.snakeToCamelcase(s));
		System.out.println("キャメルケースの文字列をスネークケースに変換");
		String c=in.next();
		System.out.println(c+"→"+SnakeCamelUtil.camelToSnakecase(c));
	}

}
