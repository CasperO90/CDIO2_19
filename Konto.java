package Spil;

public class Konto {
	
	String kontonavn;
	int beholdning;
	public Konto (String nyKontonavn) {
		kontonavn=nyKontonavn;
	}
	
	public int getBeholdning() {
		return beholdning;
	}
	
	public void setBeholdning(int nyBeholdning) {
		beholdning=nyBeholdning;
	}
	
	public void indsætPenge(int indsætning) {
		beholdning=beholdning+indsætning;
	}
	
	public void hævPenge(int hævning) {
		beholdning=beholdning-hævning;
	}
	
	public String toString() {
		return "Balance: "+beholdning;
	}
	
}
