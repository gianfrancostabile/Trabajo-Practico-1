package Beer;

public class BeerProducter extends Thread{

	private BeerHouse bh; /* Recurso Compartido */
	private int id;
	
	public BeerProducter(int id, BeerHouse bh) {
		this.id = id;
		this.bh = bh;
	}
	
	@Override
	public void run() {
		
		while(this.bh.getStock() > 0) {	
			
			try {
				this.bh.producir(this);
				Thread.sleep(1000);
			} catch (InterruptedException e) { }

		}
	
	}
	
	public int getIdProducter() {
		return this.id;
	}
}
