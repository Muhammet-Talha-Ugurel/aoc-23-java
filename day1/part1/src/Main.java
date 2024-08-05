package src;

public class Main {
	public static void main(String[] args) {
		String data;
		int sum = 0;
		ParseLine pl = new ParseLine();
		ReadLine rf = new ReadLine();
		rf.open("input.txt");

		while ((data = rf.read()) != null) {
			sum = pl.getNumber(data);
		}
		System.out.println("Sum: " + sum);
		rf.close();
	}
}
