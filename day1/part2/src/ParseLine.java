package src;

class ParseLine {
	private int sum = 0;
	private char f = '0';
	private char l = '0';

	public int getNumber(String data) {
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
		} catch (NumberFormatException e) {
			System.out.println("Invalid integer input");
		}
		return sum;
	}
}
