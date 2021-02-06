package part.shop.goods;

import part.norfolk.abs.ShopItemAbs;

/**
 * Class for snacks
 * @author jahic
 *
 */

public class Snacks  implements ShopItemAbs
{
	// Pieces of snacks in terms of boxes.
	private int quantity;

	public Snacks(int q) {
		quantity=q;
	}

	@Override
	public Integer getQuantity() {
		System.out.println("We have " + quantity + " packages of snacks.");
		return quantity;
	}

	@Override
	public void buy(int i) {
		this.quantity += i;
		System.out.println("We have " + quantity + " packages of snacks.");
	}

	@Override
	public void sell(int i) {
		this.quantity -= i;
		System.out.println("We have " + quantity + " packages of snacks.");
	}

}
