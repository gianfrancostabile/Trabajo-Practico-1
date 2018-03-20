package Beer;

public class BeerProducter implements Runnable{

	private BeerHouse bh; /* Recurso Compartido */
	private String nombre;
	
	public BeerProducter(String nombre, BeerHouse bh) {
		this.nombre = nombre;
		this.bh = bh;
	}
	
	@Override
	public void run() {
		
		while(this.bh.getStock() > 0) {	
			
			this.bh.producir(this.nombre);

			try {
				Thread.sleep(750);
			}   catch (InterruptedException e) {}
		}
	
	}
}
