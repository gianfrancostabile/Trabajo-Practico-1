package Beer;

public class BeerHouse {
	
	private int stock = 20; /* Recurso Compartido */
	private boolean disponible = true;
	
	public synchronized void consumir(String nombre) {
		
		if(this.stock > 0) {

			/* EXCLUSION MUTUA */
			while(this.disponible == false) {
				try {
					wait();
				} catch (InterruptedException e) { }
			}
			/* FIN EXCLUSION MUTUA */

			int valorQuitar = (int) Math.floor(Math.random()*this.stock+1);
			
			if(this.stock - valorQuitar >= 0) {
				this.stock = this.stock - valorQuitar;
				System.out.println("- " + nombre + " consumió " + valorQuitar + " productos. - Stock: " + this.stock);
				
			}	else {
				System.out.println("- " + nombre + ", no tenemos " + valorQuitar + " cervezas... Nuestro stock es de " + this.stock + " cervezas.");
				
			}
			this.disponible = false;

			notify();
		}
	}
	
	public synchronized void producir(String nombre) {
		
		if(this.stock < 100 && this.stock > 0) {

			/* EXCLUSION MUTUA */
			while(this.disponible == true) {
				try {
					wait();
				} catch (InterruptedException e) { }
			}
			/* FIN EXCLUSION MUTUA */

			int valorAgregar = (int) Math.floor(Math.random()*9+1);
			
			if((this.stock + valorAgregar) < 100) {
				this.stock = this.stock + valorAgregar;
				System.out.println("- " + nombre + " creó " + valorAgregar + " productos. - Stock: " + this.stock);
			
			}	else {
				System.out.println("(*) El productor " + nombre + " creó " + valorAgregar + " productos y no se agregaron porque se excede de 100 unidades.");
			}
			
			this.disponible = true;
			
			notify();
		
		}

	}
	
	public int getStock() {
		return this.stock;
	}

}
