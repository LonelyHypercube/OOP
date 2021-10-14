import java.util.Random;

public class Bot {
	public static String[][] botik(String[] args){
		String[][] arr = Board.array;
		System.out.println("Хід бота");
		Random rnd = new Random();
		int botPos = rnd.nextInt(9) + 1;
		switch(botPos) {
		case(1):
			if(arr[0][0] == " ") {
				Board.array[0][0] = "O";
				break;
			}
		case(2):
			if(arr[0][1] == " ") {
				Board.array[0][1] = "O";
				break;
			}
		case(3):
			if(arr[0][2] == " ") {
				Board.array[0][2] = "O";
				break;
			}
		case(4):
			if(arr[1][0] == " ") {
				Board.array[1][0] = "O";
				break;
			}
		case(5):
			if(arr[1][1] == " ") {
				Board.array[1][1] = "O";
				break;
			}
		case(6):
			if(arr[1][2] == " ") {
				Board.array[1][2] = "O";
				break;
			}
		case(7):
			if(arr[2][0] == " ") {
				Board.array[2][0] = "O";
				break;
			}
		case(8):
			if(arr[2][1] == " ") {
				Board.array[2][1] = "O";
				break;
			}
		case(9):
			if(arr[2][2] == " ") {
				Board.array[2][2] = "O";
				break;
			}
		}
		return arr;
	}
}
