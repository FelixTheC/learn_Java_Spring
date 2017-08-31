package online.ftc_webdev.domain.products;

public abstract class GenericProduct {
	public int priceRandomizer = 1000;
	public abstract int calculatePrice();
}
