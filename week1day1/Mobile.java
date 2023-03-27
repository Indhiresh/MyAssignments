package week1day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="oppo";
		float mobileWeight=186f;
		System.out.println("This is my oppo phone");
	}
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=25000;
		System.out.println("This is the cost of my oppo phone");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile phone=new Mobile();
		phone.makeCall();
		phone.sendMsg();
	}

}
