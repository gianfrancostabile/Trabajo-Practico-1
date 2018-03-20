
import Beer.BeerConsumer;
import Beer.BeerHouse;
import Beer.BeerProducter;

public class Main {

	public static void main(String[] args) {
		
		BeerHouse bh = new BeerHouse();
		
		BeerProducter bp1 = new BeerProducter("Juan", bh);
		Thread thread_bp1 = new Thread(bp1);
		
		BeerConsumer bc1 = new BeerConsumer("Pedro", bh);

		thread_bp1.start();
		bc1.start();

	}

}
