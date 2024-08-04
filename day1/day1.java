import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

class day1 {
	public static void main(String[] args) {
		try {
			int sum = 0;
			char f = '0';
			char l = '0';
			File myObj = new File("input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				for (int i = 0; i < data.length(); i++) {
					char c = data.charAt(i);
					if (Character.isDigit(c)) {
						f = c;
						break;
					}
				}
				for (int i = data.length() - 1; i >= 0 ; i--) {
					char c = data.charAt(i);
					if (Character.isDigit(c)) {
						l = c;
						break;
					}
				}
				String s = "" + f + l;
				try {
					sum += Integer.valueOf(s);
					System.out.println("Converted integer: " + sum);
				} catch (NumberFormatException e) {
					System.out.println("Invalid integer input");
				}
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}

