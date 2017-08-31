package online.ftc_webdev.domain.promotion;

import online.ftc_webdev.domain.products.ConsumerProduct;
import online.ftc_webdev.domain.products.IndustrialProduct;

public class TradeFair {
	private IndustrialProduct industrialProduct;
	private ConsumerProduct consumerProduct;
	
	public int declareIndustrialPrice(IndustrialProduct industrialProduct) {
		return industrialProduct.calculatePrice();
	}
	
	public int declareConsumerProduct(ConsumerProduct consumerProduct) {
		return consumerProduct.calculatePrice();
	}
	
	public String specialPromotionalPricing() {
		String priceInfo = "Industrial Product is priced at " + declareIndustrialPrice(industrialProduct) + " € and " +
							"Consumer Product is priced at " + declareConsumerProduct(consumerProduct);
		
		return priceInfo;
	}
}
