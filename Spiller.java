package Spil;
import Spil.Konto;
import desktop_resources.GUI;


public class Spiller {
	private String navn;
	private int startSum;
	
	private Konto k = new Konto("spillerKonto");
	
	public Spiller (String nytNavn) {
		navn=nytNavn;
	}
	
	public int getScore() {
		return k.getBeholdning();
	}
	
	public void setScore(int nyScore) {
		k.setBeholdning(nyScore);
	}
	
	public String toString() {
		return navn+" - "+k.toString();
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setNavn(String nytNavn) {
		navn=nytNavn;
	}
	
	
	public int getStartSum() { // disse bruges når der slås om at starte
		return startSum;
	}
	public void setStartSum(int n) {
		startSum=n;
	}
	
}
