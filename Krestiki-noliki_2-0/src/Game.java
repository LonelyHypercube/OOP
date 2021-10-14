import java.util.Scanner;
public class Game {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		boolean isSpace = true;
		String[][] arr = {{" ", " ", " "},{" ", " ", " "},{" ", " ", " "}};
		int i = 2;
		while(isSpace == true) {
			if (arr[0][0] == "X" && arr[0][1] == "X" && arr[0][2] == "X") {
				System.out.println("Ви перемогли!");
				break;
			} else if (arr[1][0] == "X" && arr[1][1] == "X" && arr[1][2] == "X") {
				System.out.println("Ви перемогли!");
				break;
			} else if (arr[2][0] == "X" && arr[2][1] == "X" && arr[2][2] == "X") {
				System.out.println("Ви перемогли!");
				break;
			} else if (arr[0][0] == "X" && arr[1][0] == "X" && arr[2][0] == "X") {
				System.out.println("Ви перемогли!");
				break;
			} else if (arr[0][1] == "X" && arr[1][1] == "X" && arr[2][1] == "X") {
				System.out.println("Ви перемогли!");
				break;
			} else if (arr[0][2] == "X" && arr[1][2] == "X" && arr[2][2] == "X") {
				System.out.println("Ви перемогли!");			
			} else if (arr[0][0] == "X" && arr[1][1] == "X" && arr[2][2] == "X") {
				System.out.println("Ви перемогли!");
				break;
			} else if (arr[0][2] == "X" && arr[1][1] == "X" && arr[2][0] == "X") {
				System.out.println("Ви перемогли!");
				break;
			}
			if (arr[0][0] == "O" && arr[0][1] == "O" && arr[0][2] == "O") {
				System.out.println("Бот переміг!");
				break;
			} else if (arr[1][0] == "O" && arr[1][1] == "O" && arr[1][2] == "O") {
				System.out.println("Бот переміг!");
				break;
			} else if (arr[2][0] == "O" && arr[2][1] == "O" && arr[2][2] == "O") {
				System.out.println("Бот переміг!");
				break;
			} else if (arr[0][0] == "O" && arr[1][0] == "O" && arr[2][0] == "O") {
				System.out.println("Бот переміг!");
				break;
			} else if (arr[0][1] == "O" && arr[1][1] == "O" && arr[2][1] == "O") {
				System.out.println("Бот переміг!");
				break;
			} else if (arr[0][2] == "O" && arr[1][2] == "O" && arr[2][2] == "O") {
				System.out.println("Бот переміг!");
				break;
			} else if (arr[0][0] == "O" && arr[1][1] == "O" && arr[2][2] == "O") {
				System.out.println("Бот переміг!");
				break;
			} else if (arr[0][2] == "O" && arr[1][1] == "O" && arr[2][0] == "O") {
				System.out.println("Бот переміг!");
				break;
			}
			if (i % 2 == 0) {
			arr = player.user(args);
			i++;
			} else {
			arr = Bot.botik(args);
			i++;
			}
			boolean qw = false;
		for (String[] ss : arr) {
			for (String s : ss) {
				System.out.print("[" + s + "]");
				if(s == " ") {
					qw = true;
				}
			}
			System.out.println();
		}
		if(qw == false) {
			System.out.println("Закінчились ходи");
			isSpace = false;
		}
	}
}
}
