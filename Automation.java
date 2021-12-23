package week3.day2;


	public class Automation extends Multiplelanguage {

		public void java() {
			System.out.println("I am Learning Java");

		}
		@Override
		public void Ruby() {
			System.out.println("I am Learning Ruby");
		}

		public void Selenium() {
			System.out.println("I am Learning Selenium");
			
		}
		public static void main(String[] args) {
			Automation al = new Automation();
			al.java();
			al.Ruby();
			al.Selenium();
		}

		

	}


