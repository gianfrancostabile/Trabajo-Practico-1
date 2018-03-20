package Beer;

public class BeerConsumer extends Thread{
	
	@Override
	public void run() {
		
		while(BeerHouse.stock > 0) {
			BeerHouse.consumir();
		
		}
		System.out.println("No hay mas cervezas GIL.");
		
	}
}
