package Beer;

public class BeerHouse {
	
	private int stock = 1;
	private boolean disponible = false;
	
	public synchronized void consumir(BeerConsumer bc) throws InterruptedException{
		
		if(this.stock > 0) {
			
			while(!disponible) {
				wait();
			}

			int cantQuitar = (int) Math.floor(Math.random()*this.stock+1);
			
			if(this.stock - cantQuitar >= 0) {
				this.stock = this.stock - cantQuitar;
				System.out.println("Consumidor #" + bc.getIdConsumer() + " sacó: " + cantQuitar + " - Stock: " + this.stock);
				
			}	else {
				System.out.println("Consumidor #" + bc.getIdConsumer() + ", no tenemos " + cantQuitar + " cervezas... Nuestro stock es de " + this.stock + " cervezas.");
				
			}
			this.disponible = false;
			
			notifyAll();
		}
	}
	
	public synchronized void producir(BeerProducter bp) throws InterruptedException{
		
		if(this.stock < 100 && this.stock > 0) {

			while(disponible) {
				wait();
			}

			int cantAgregar = (int) Math.floor(Math.random()*9+1);
			if((this.stock + cantAgregar) < 101) {
				this.stock = this.stock + cantAgregar;
				System.out.println("Productor #" + bp.getIdProducter() + " pone: " + cantAgregar + " - Stock: " + this.stock);
			
			}	else {
				System.out.println("Productor #" + bp.getIdProducter() + " pone: " + cantAgregar + " (No cargado - Máx 100.)");
			}
			
			this.disponible = true;
			
			notifyAll();
		}

	}
	
	public int getStock() {
		return this.stock;
	}

}
