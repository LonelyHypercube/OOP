package main;
import java.util.Scanner;
public class player {
	static Scanner in = new Scanner(System.in);
	public static String[][] user (String[] args){
		String[][] arr = Board.array;
		System.out.println("Хід гравця");
		System.out.println("Виберіть клітинку(1-9)");
		String pos = in.next();
		switch(pos) {
		case("1"):
			if(arr[0][0] != " ") {
				System.out.println("Ця клітинка зайнята, виберіть іншу");
				break;
			}
			Board.array[0][0] = "X";
			break;
		case("2"):
			if(arr[0][1] != " ") {
				System.out.println("Ця клітинка зайнята, виберіть іншу");
				break;
			}
		Board.array[0][1] = "X";
			break;
		case("3"):
			if(arr[0][2] != " ") {
				System.out.println("Ця клітинка зайнята, виберіть іншу");
				break;
			}
		Board.array[0][2] = "X";
			break;
		case("4"):
			if(arr[1][0] != " ") {
				System.out.println("Ця клітинка зайнята, виберіть іншу");
				break;
			}
		Board.array[1][0] = "X";
			break;
		case("5"):
			if(arr[1][1] != " ") {
				System.out.println("Ця клітинка зайнята, виберіть іншу");
				break;
			}
		Board.array[1][1] = "X";
			break;
		case("6"):
			if(arr[1][2] != " ") {
				System.out.println("Ця клітинка зайнята, виберіть іншу");
				break;
			}
		Board.array[1][2] = "X";
			break;
		case("7"):
			if(arr[2][0] != " ") {
				System.out.println("Ця клітинка зайнята, виберіть іншу");
				break;
			}
		Board.array[2][0] = "X";
			break;
		case("8"):
			if(arr[2][1] != " ") {
				System.out.println("Ця клітинка зайнята, виберіть іншу");
				break;
			}
		Board.array[2][1] = "X";
			break;
		case("9"):
			if(arr[2][2] != " ") {
				System.out.println("Ця клітинка зайнята, виберіть іншу");
				break;
			}
		Board.array[2][2] = "X";
			break;
			
		}
		return Board.array;
		}
	}