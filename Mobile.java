package week1.day1;

public class Mobile {
	String mobileModel = "vivo";
	int mobileWeight = 198;
	boolean isFullCharge = false;
	double moibleCost = 30000;
	
	public void makeCall() {
		System.out.println("call connected");
	}
    public void sendMsg() {
    	System.out.println("msg received");
    }
    public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println(mob.mobileModel);
		System.out.println(mob.mobileWeight);
		System.out.println(mob.isFullCharge);
		System.out.println(mob.moibleCost);
	}
}
