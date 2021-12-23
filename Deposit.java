package week3.day1;

	public class Deposit extends Bankinfo {
		public void deposit() {

			System.out.println("Amount deposited in local branch");

		}
		
		public static void main(String[] args) {
			Deposit ad=new Deposit();
			ad.deposit();
			ad.savings();
			ad.Fixed();
		}

	}

	
