import java.util.Scanner;
public class StringToInteger {
		public static int convert_String_To_Number(String numStr) {
			char ch[] = numStr.toCharArray();
			int sum = 0;
			//get ascii value for zero
			int zeroAscii = (int)'0';
			for (char c:ch) {
				int tmpAscii = (int)c;
				sum = (sum*10)+(tmpAscii-zeroAscii);
			}
			return sum;
		}
		public static void main(String a[]) {
			Scanner scanner = new Scanner(System. in); 
			String input = scanner. nextLine();
			System.out.println( input + " = "+convert_String_To_Number(input));
		}
	}

