import java.util.Scanner;

public class LicenseKeys {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System. in); 
		String string = scanner.nextLine();
		int integer = scanner.nextInt();
		licensekeys(string,integer);
	}
	
	public static void licensekeys(String string, int integer){ //changing to upper case
		
		string = string.toUpperCase();
		StringBuilder str = new StringBuilder(string);
		for (int index = 0; index < str.length(); index++) {
		    if (str.charAt(index) == '-') {
		        str.deleteCharAt(index);
		    }
		}
		int count = 0;
		int length = str.length();
		int lengthtemp = str.length();

		if(length%4 == 0 || integer == 3){
			for(int j=length/integer;j>1;j--){
				str.insert(lengthtemp-integer,'-');
				lengthtemp = lengthtemp-integer;				
				}
		}
		else{
			for(int j=length/integer;j>0;j--){
				str.insert(lengthtemp-integer,'-');
				lengthtemp = lengthtemp-integer;				
				}
		}
		str.toString();
		System.out.println(str);
		
		}
	}

