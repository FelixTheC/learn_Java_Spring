package online.ftc_webdev.spring_demo.domain.product;

public abstract class GenericProduct {
	public int priceRandomizer = 1000;
	public abstract int calculatePrice();
}
