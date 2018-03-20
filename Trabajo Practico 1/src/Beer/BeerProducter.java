package Beer;

public class BeerProducter extends Thread{
	
	@Override
	public void run() {
		
		while(BeerHouse.stock > 0) {
			
			if(BeerHouse.stock < 100) {
				BeerHouse.producir();

			}	else {
				System.out.println("El maximo de cerveza es 100.");
				notifyAll();
			}
			
		}
		
	}
}
