public class Main{

	public static void main(String[] args){
	
	/*DVD dvd1 = new DVD(11,9,3,"oyoy","Michael");
	CD cd1 = new CD(13,12,15,"Cows","John");
	
	Product cd=new CD(13,12,17,"Mom","Dad");
	
	System.out.println(dvd1.getDirector());
	System.out.println(((CD)cd).getArtist());*/
	
	DVD myDVD = new DVD (11.17 , 9 , 102 ,
" Your Name " , " Makoto Shinkai " );
//Playable myPlayable = myDVD ; - Reference for first DVD object
//System.out.println(myDVD.getTitle());
//System.out.println(myDVD.getRuntime());
//System.out.println(myDVD.getRentalCost()); 

DVD myDVD2 = new DVD(1,2,3,"Country Roads","Take me home");
Playable myPlayable = myDVD2 ;

myDVD2=(DVD)myPlayable;
System.out.println(myDVD2.getDirector());


	
	}
}