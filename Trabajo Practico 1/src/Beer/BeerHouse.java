package Beer;

public class BeerHouse {
	
	public static int stock = 5;
	
	public static synchronized void consumir() {
		stock = stock - 1;
		System.out.println("Consumido - Stock: " + stock);
	}
	
	public static synchronized void producir() {
		stock = stock + 1;
		System.out.println("Producido - Stock: " + stock);
	}
}
