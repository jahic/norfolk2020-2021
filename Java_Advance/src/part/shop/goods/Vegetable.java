package part.shop.goods;

import part.norfolk.abs.ShopItemAbs;

/**
 * Any type of vegetables in a shop.
 * @author jahic
 *
 */

public class Vegetable implements ShopItemAbs
{
	// Kilograms.
	private int quantity;
	
	public Vegetable(int q) {
		quantity= q;
	}

	@Override
	public Integer getQuantity() {
		System.out.println("We have " + quantity + " kg of vegetables.");
		return quantity;
	}

	@Override
	public void buy(int i) {
		this.quantity += i;
		System.out.println("We have " + quantity + " kg of vegetables.");	
	}

	@Override
	public void sell(int i) {
		this.quantity -= i;
		System.out.println("We have " + quantity + " kg of vegetables.");			
	}

}
