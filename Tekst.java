package Spil;

public class Tekst {

	public Tekst() {
		
	}
	
	// Tekst for når man lander på et felt.
	public String felt2 = "Du fandt prinsessen i tårnet! Kongen belønner dig med 250.";
	public String felt3 = "Du falder i krateret og brækker benet. Lægeregningen: 100.";
	public String felt4 = "Du fandt prinsessen i tårnet! Kongen belønner dig med 250.";
	public String felt5 = "Du er i den kolde ørken. Du køber en billig sovepose til 20 for at overleve.";
	public String felt6 = "Du handler på Walled Citys marked og tjener 180.";
	public String felt7 = "Du ringer med klosterets klokker men får ikke noget ud af det.";
	public String felt8 = "Du går ind i en mørk hule, og bliver berøvet for 70 af den lokale bande.";
	public String felt9 = "Du spiller spil i Mountain Huts casino. Du vinder 60.";
	public String felt10 = "Du bliver bidt af en vareulv og skal behandles for 80, men får lov at slå igen!";
	public String felt11 = "Du skal ned og slås i pitten, og ser dig nødsaget til at opgradere din rustning for 50.";
	public String felt12 = "Du stjæler guld for en værdi af 650 fra naboens guldmine. Du er nu rig!!!";
	
	
	
	
	public String landetPå(int i) {
		String h=null;
		switch (i) {
		case 2: h=felt2; break;
		case 3: h=felt3; break;
		case 4: h=felt4; break;
		case 5: h=felt5; break;
		case 6: h=felt6; break;
		case 7: h=felt7; break;
		case 8: h=felt8; break;
		case 9: h=felt9; break;
		case 10: h=felt10; break;
		case 11: h=felt11; break;
		case 12: h=felt12; break;
		}
		return h;
	}
	
}
