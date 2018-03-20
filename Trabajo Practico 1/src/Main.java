import Beer.BeerConsumer;
import Beer.BeerHouse;
import Beer.BeerProducter;

public class Main {

	public static void main(String[] args) {
		
		BeerHouse bh = new BeerHouse();
		
		BeerProducter bp = new BeerProducter("P 1", bh);
		BeerConsumer bc = new BeerConsumer("C 1", bh);

		bp.start();
		bc.start();

	}

}
