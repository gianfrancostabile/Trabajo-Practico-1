package Beer;

public class BeerProducter extends Thread{

	private BeerHouse bh;
	private String nombre;
	
	public BeerProducter(String nombre, BeerHouse bh) {
		this.nombre = nombre;
		this.bh = bh;
	}
	
	@Override
	public void run() {
		
		while(this.bh.getStock() > 0) {	

			this.bh.producir(this.nombre);
			
		}
	
	}
}
