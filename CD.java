public class CD extends Playable{

protected String artist;

public CD(double price, int numStock, double runtime, String title, String artist){
	this.price = price;
	this.numStock = numStock;
	this.runtime = runtime;
	this.title = title;
	this.artist = artist;
	}
	
	public String getArtist(){
		return artist;
	}
		
	public void setArtist(String artist){
		this.artist = artist;
	}
}
	