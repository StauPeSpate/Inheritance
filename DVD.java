public class DVD extends Playable{

protected String director;

public DVD(double price, int numStock, double runtime, String title, String director){
	this.price = price;
	this.numStock = numStock;
	this.runtime = runtime;
	this.title = title;
	this.director = director;
	}
	
	public String getDirector(){
		return director;
	}
	
	public void setDirector(String director){
		this.director = director;
	}
	
	@Override
	public double getRentalCost(){
		return rentalCost = 1.2;
	}		
}

