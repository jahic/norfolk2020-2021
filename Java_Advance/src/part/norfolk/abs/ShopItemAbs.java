package part.norfolk.abs;

/**
 * Interface for all shop items.
 * @author jahic
 *
 */

public interface ShopItemAbs
{
	// Current state on the shop's stack
	Integer getQuantity();
	
	// Add to the shop's stack
	void buy(int i);

	// Remove from the shop's stack
	void sell(int i);
}
