package week1day1;

public class Tab {
	
		public int tabPrice(int tabPrice) {
			return tabPrice;
		}
		
			public String tabBrand(String brandName){
				return brandName;
			}
			
		public static void main(String[] args) {
				
			Tab rate=new Tab();
			//rate.tabBrand("Sakthi");
			System.out.println(rate.tabBrand("sakthi"));
			System.out.println(rate.tabPrice(1200));
	}

}
