package test.norfolk.abs;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

import part.norfolk.abs.ShopItemAbs;
import part.shop.goods.Snacks;
import part.shop.goods.Vegetable;

/**
 * Operations on shop items.
 * Test sell and buy.
 * @author jahic
 *
 */

class TestInterface {

	@Test
	void testSell()
	{
		LinkedList<ShopItemAbs> items = new LinkedList<ShopItemAbs>();
		
		// Set init value 
		for(int i=0; i<10;i++)
		{
			if(i<5)
			{
				items.add(new Vegetable(5));
				continue;
			}
			else
				items.add(new Snacks(10));
		}
		
		// If we sell an item, we expect its quantity to decrease
		for(ShopItemAbs i:items)
		{
			i.sell(2);
		}
		
		// Check if the value is correct
		for(int i=0; i<10;i++)
		{
			// 5-2 = 3
			if(i<5)
				assertEquals(items.get(i).getQuantity(), 3);
			// 10-2 = 8
			else
				assertEquals(items.get(i).getQuantity(), 8);
		}
	}
	
	@Test
	void testBuy()
	{
		LinkedList<ShopItemAbs> items = new LinkedList<ShopItemAbs>();
		
		// Set init value 
		for(int i=0; i<10;i++)
		{
			if(i<5)
			{
				items.add(new Vegetable(5));
				continue;
			}
			else
				items.add(new Snacks(10));
		}
		
		// If we buy an item, we expect its quantity to increase
		for(ShopItemAbs i:items)
		{
			i.buy(2);
		}
		
		// Check if the value is correct
		for(int i=0; i<10;i++)
		{
			// 5+2 = 7
			if(i<5)
				assertEquals(items.get(i).getQuantity(), 7);
			// 10+2 = 12
			else
				assertEquals(items.get(i).getQuantity(), 12);
		}
	}

}
