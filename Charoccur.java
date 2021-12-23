package week1.day2;

public class Charoccur {

		public static void main(String[] args) {
			String str = "Welcome to Chennai";
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'e') {
					count++;
				}
			}
			System.out.println("Frequency of e is: " + count);
		}

	}


