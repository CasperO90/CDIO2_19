package Spil;
import Spil.Tekst;
import desktop_resources.GUI;


public class TerningSpil {
	public static void main(String[] args) {
		
		Bræt b = new Bræt();
		Spiller s1 = new Spiller("spiller1"); s1.setScore(1000); GUI.addPlayer(s1.getNavn(), 1000);
		Spiller s2 = new Spiller("spiller2"); s2.setScore(1000); GUI.addPlayer(s2.getNavn(), 1000); 
		Raflebæger r = new Raflebæger();
		GUI.setCar(3, s2.getNavn());

		
		tur(s1);
		tur(s2);
		
		
		GUI.showMessage(s1.toString());
		GUI.setBalance(s1.getNavn(), s1.k.getBeholdning());
		
	}
		public static Raflebæger r = new Raflebæger();
		public static Tekst t = new Tekst();
		
		
	public static void tur(Spiller s) {
		for (boolean tur=true; tur!=false;) {
		r.slå();
		switch(r.getSamletVærdi()) {
		case 2: GUI.showMessage(t.landetPå(2)); s.k.setBeholdning(s.k.getBeholdning()+250);  break; 
		case 3: GUI.showMessage(t.landetPå(3)); s.k.setBeholdning(s.k.getBeholdning()-100); break;
		case 4: GUI.showMessage(t.landetPå(4)); s.k.setBeholdning(s.k.getBeholdning()+100); break;
		case 5: GUI.showMessage(t.landetPå(5)); s.k.setBeholdning(s.k.getBeholdning()-20); break;
		case 6: GUI.showMessage(t.landetPå(6)); s.k.setBeholdning(s.k.getBeholdning()+180); break;
		case 7: GUI.showMessage(t.landetPå(7)); s.k.setBeholdning(s.k.getBeholdning()); break;
		case 8: GUI.showMessage(t.landetPå(8)); s.k.setBeholdning(s.k.getBeholdning()-70); break;
		case 9: GUI.showMessage(t.landetPå(9)); s.k.setBeholdning(s.k.getBeholdning()+60); break;
		case 10: GUI.showMessage(t.landetPå(10)); s.k.setBeholdning(s.k.getBeholdning()-80); break;
		case 11: GUI.showMessage(t.landetPå(11)); s.k.setBeholdning(s.k.getBeholdning()-50); break;
		case 12: GUI.showMessage(t.landetPå(12)); s.k.setBeholdning(s.k.getBeholdning()+650);break;
		}
		if (r.getSamletVærdi()==10){
			tur=true;
		}
		else tur=false;
		}
		
	}
}


