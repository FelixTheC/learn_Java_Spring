package online.ftc_webdev.spring_demo.domain.promotion;

import online.ftc_webdev.spring_demo.domain.product.ConsumerProduct;
import online.ftc_webdev.spring_demo.domain.product.IndustrialProduct;

public class TradeFair {
	private IndustrialProduct industrialProduct;
	private ConsumerProduct consumerProduct;
	
	public int delcareIndustrialProductPrice(IndustrialProduct industrialProduct) {
		return industrialProduct.calculatePrice();
	}
	
	public int declareConsumerProductPrice(ConsumerProduct consumerProduct) {
		return consumerProduct.calculatePrice();
	}
	
	public String specialPromotionPricing() {
		String priceInfo = "Industrial Product is priced at " + delcareIndustrialProductPrice(industrialProduct) + " € and " + 
							"Consumer Product is priced at" + declareConsumerProductPrice(consumerProduct) + "€";
		return priceInfo;
	}
}
