package twentytwo;

public class Item {
	double price = 0;
	double getDiscountPrice() {
		
	
	double discount = price *0.2;
	double discountPrice = price-discount;
	return discountPrice;
	}
	
	public static void main(String[] args) { 
		Item itm = new Item();
		System.out.println(itm.getDiscountPrice());
	}

}
