package main;
import java.io.*;
import java.util.Scanner;
public class Game {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		File score = new File("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
		FileReader fr;
		try {
			fr = new FileReader(score);
			BufferedReader reader = new BufferedReader(fr);
			int i = 2;
			int iter = 0;
			int wins = 0;
			int loses = 0;
			String line = reader.readLine();
			while(line != null) {
				if(iter == 4) {
					wins = Integer.parseInt(line);
					System.out.println("Кількість перемог: " + wins);
				} else if(iter == 2) {
					loses = Integer.parseInt(line);
					System.out.println("Кількість програшів: " + loses);
				}
				iter++;
				line = reader.readLine();
			}
			FileWriter write;
		boolean isSpace = true;
		String[][] arr = {{" ", " ", " "},{" ", " ", " "},{" ", " ", " "}};
		while(isSpace == true) {
			if (arr[0][0] == "X" && arr[0][1] == "X" && arr[0][2] == "X") {
				System.out.println("Ви перемогли!");
				wins = wins + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[1][0] == "X" && arr[1][1] == "X" && arr[1][2] == "X") {
				System.out.println("Ви перемогли!");
				wins = wins + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[2][0] == "X" && arr[2][1] == "X" && arr[2][2] == "X") {
				System.out.println("Ви перемогли!");
				wins = wins + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[0][0] == "X" && arr[1][0] == "X" && arr[2][0] == "X") {
				System.out.println("Ви перемогли!");
				wins = wins + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[0][1] == "X" && arr[1][1] == "X" && arr[2][1] == "X") {
				System.out.println("Ви перемогли!");
				wins = wins + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[0][2] == "X" && arr[1][2] == "X" && arr[2][2] == "X") {
				System.out.println("Ви перемогли!");
				wins = wins + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
			} else if (arr[0][0] == "X" && arr[1][1] == "X" && arr[2][2] == "X") {
				System.out.println("Ви перемогли!");
				wins = wins + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[0][2] == "X" && arr[1][1] == "X" && arr[2][0] == "X") {
				System.out.println("Ви перемогли!");
				wins = wins + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			}
			if (arr[0][0] == "O" && arr[0][1] == "O" && arr[0][2] == "O") {
				System.out.println("Бот переміг!");
				loses = loses + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[1][0] == "O" && arr[1][1] == "O" && arr[1][2] == "O") {
				System.out.println("Бот переміг!");
				loses = loses + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[2][0] == "O" && arr[2][1] == "O" && arr[2][2] == "O") {
				System.out.println("Бот переміг!");
				loses = loses + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[0][0] == "O" && arr[1][0] == "O" && arr[2][0] == "O") {
				System.out.println("Бот переміг!");
				loses = loses + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[0][1] == "O" && arr[1][1] == "O" && arr[2][1] == "O") {
				System.out.println("Бот переміг!");
				loses = loses + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[0][2] == "O" && arr[1][2] == "O" && arr[2][2] == "O") {
				System.out.println("Бот переміг!");
				loses = loses + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[0][0] == "O" && arr[1][1] == "O" && arr[2][2] == "O") {
				System.out.println("Бот переміг!");
				loses = loses + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
				break;
			} else if (arr[0][2] == "O" && arr[1][1] == "O" && arr[2][0] == "O") {
				System.out.println("Бот переміг!");
				loses = loses + 1;
				write =  new FileWriter("C:\\Users\\Home\\eclipse-workspace\\Krestiki-noliki_2-0\\src\\main\\score.txt");
				write.write("Результати: \n Бот: \n" + loses + "\n гравець: \n" + wins + "\n ок");
				write.flush();
				write.close();
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        }
}
}