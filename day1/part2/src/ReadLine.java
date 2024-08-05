package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadLine {
	private String data;
	private File myObj;
	private Scanner myReader;

	public String read() {
	while (myReader.hasNextLine()) {
			this.data = myReader.nextLine();
			return data;
		}
		return null;
	}

	public void close() {
		this.myReader.close();
	}

	public void open(String path) {
		try {
			this.myObj = new File(path);
			this.myReader = new Scanner(myObj);
		} catch (FileNotFoundException e) {
			System.out.println(path + " not found");
			System.exit(1);
		}
	}
}
