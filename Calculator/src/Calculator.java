import java.util.Scanner;
public class Calculator {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a = getInt();
		while(true) {
		char oper = getOperation();
		int b = getInt();
		int result = calc(a, b, oper);
		System.out.println("Результат: "+ result);
		a = result;
		}
	}
	public static int getInt() {
		System.out.println("Введіть число");
		int num;
		if(in.hasNextInt()) {
			num = in.nextInt();
		} else {
			System.out.println("Недопустиме число");
			in.next();
			num = getInt();
		}
		return num;
	}
	public static char getOperation() {
		System.out.println("Введіть операцию");
		char oper;
		if(in.hasNext()) {
			oper = in.next().charAt(0);
		} else {
			System.out.println("Недопустимий оператор");
			in.next();
			oper = getOperation();
		}
		return oper;
	}
	
	public static int calc(int a, int b, char oper) {
		int result;
		switch(oper) {
		case '+':
			result = a+b;
			break;
		case '-':
			result = a-b;
			break;
		case '*':
			result = a*b;
			break;
		case '/':
			result = a/b;
			break;
		default:
			System.out.println("Операція не розпізнана, повторіть ввід");
			result = calc(a, b, getOperation());
			}
		return result;
	}
}
