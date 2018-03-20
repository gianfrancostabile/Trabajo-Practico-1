package Beer;

public class BeerConsumer extends Thread{
	
	private BeerHouse bh; /* Recurso Compartido */
	private String nombre;
	
	public BeerConsumer(String nombre, BeerHouse bh) {
		this.nombre = nombre;
		this.bh = bh;
	}
	
	@Override
	public void run() {

		while(this.bh.getStock() > 0) {

			this.bh.consumir(this.nombre);

		}
		
		System.out.println("\nLa BeerHouse ya no posee stock de productos.");
		
	}
}
