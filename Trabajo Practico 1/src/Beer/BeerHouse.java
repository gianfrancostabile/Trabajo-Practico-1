package Beer;

public class BeerHouse {
	
	public int stock = 5;
	
	public synchronized void consumir(String nombre) {
		
		if(this.stock > 0) {
			this.stock = this.stock - 1;
			System.out.println("Consumido por " + nombre + " - Stock: " + this.stock);
		
		}
	}
	
	public synchronized void producir(String nombre) {
		
		if(this.stock < 100 && this.stock > 0) {
			this.stock = this.stock + 1;
			System.out.println("Producido por " + nombre + " - Stock: " + this.stock);
			
		}	else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int getStock() {
		return this.stock;
	}
}
