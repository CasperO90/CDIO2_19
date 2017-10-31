package Spil;
import Spil.Konto;


public class Spiller {
	String navn;
	int score;
	
	public Konto k = new Konto("spillerKonto");
	
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
	
	
	
	
}
