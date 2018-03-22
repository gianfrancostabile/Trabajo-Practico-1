
import Beer.BeerConsumer;
import Beer.BeerHouse;
import Beer.BeerProducter;

public class Main {

	public static void main(String[] args) {
		
		BeerHouse bh = new BeerHouse();

		new BeerProducter(1, bh).start();		
		
		new BeerConsumer(2, bh).start();
		new BeerConsumer(3, bh).start();
		new BeerConsumer(4, bh).start();
		new BeerConsumer(5, bh).start();
		new BeerConsumer(6, bh).start();
		new BeerConsumer(7, bh).start();
		new BeerConsumer(8, bh).start();
		new BeerConsumer(9, bh).start();
	}

}
