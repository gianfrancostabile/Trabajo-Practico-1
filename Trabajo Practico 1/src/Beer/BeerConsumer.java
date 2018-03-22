package Beer;

public class BeerConsumer extends Thread{
	
	private BeerHouse bh; /* Recurso Compartido */
	private int id;
	
	public BeerConsumer(int id, BeerHouse bh) {
		this.id = id;
		this.bh = bh;
	}
	
	@Override
	public void run() {

		while(this.bh.getStock() > 0) {
			
			try {
				
				this.bh.consumir(this);
				
			} catch (InterruptedException e) { }

		}
		
	}
	
	public int getIdConsumer() {
		return this.id;
	}
}
