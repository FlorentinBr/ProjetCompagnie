package packageProjet;
import java.io.*;
import java.net.*;


public abstract class Main {
	public static void main(String [] args){
	
	

	 try{
	 URL url = new URL("https://fr.distance.to/A%C3%A9roport-Paris-Charles-de-Gaulle,77990,Mauregard,Seine-et-Marne,%C3%8Ele-de-France,FRA/A%C3%A9roport-Rennes-Bretagne,Avenue-de-l'A%C3%A9roport-Joseph-le-Brix,35136,Saint-Jacques-de-la-Lande,Ille-et-Vilaine,Bretagne,FRA");
	  
	 URLConnection con=url.openConnection();
	 System.out.println(con.getContent());
	    InputStream input = con.getInputStream();
	    while(input.available()>0)
	    System.out.print((char)input.read());
	 }
	 catch(MalformedURLException e){
	 System.out.println(e);
	 }
	 catch(IOException e){
	 System.out.println(e);
	 }
}
}




