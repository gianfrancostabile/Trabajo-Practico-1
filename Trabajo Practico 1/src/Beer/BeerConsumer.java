package Beer;

public class BeerConsumer extends Thread{
	
	private BeerHouse bh;
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
		
		System.out.println("No hay mas cervezas GIL.");
		
	}
}
