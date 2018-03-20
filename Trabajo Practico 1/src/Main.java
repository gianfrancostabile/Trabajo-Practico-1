import Beer.BeerConsumer;
import Beer.BeerProducter;

public class Main {

	public static void main(String[] args) {

		BeerProducter bp = new BeerProducter();
		BeerConsumer bc = new BeerConsumer();

		bp.start();
		bc.start();

	}

}
