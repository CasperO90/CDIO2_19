package Spil;
import java.awt.Color;

import desktop_codebehind.Car;
import desktop_resources.GUI;


public class TerningSpil {
	public static void main(String[] args) {
		
		Bræt b = new Bræt();
		Car car1 = new Car.Builder().primaryColor(Color.blue).secondaryColor(Color.black).typeTractor().patternDotted().build();
		Car car2 = new Car.Builder().primaryColor(Color.RED).secondaryColor(Color.WHITE).typeUfo().patternDotted().build();
		Spiller s1 = new Spiller(GUI.getUserString(t.indtastNavn1)); s1.setScore(1000); GUI.addPlayer(s1.getNavn(), 1000, car1); GUI.setCar(1, s1.getNavn());
		Spiller s2 = new Spiller(GUI.getUserString(t.indtastNavn2)); s2.setScore(1000); GUI.addPlayer(s2.getNavn(), 1000, car2); GUI.setCar(1, s2.getNavn());

		
		
		GUI.showMessage(t.slåOmStart);
		boolean ingenStarter=true;
		boolean s1Starter = false;
		boolean s2Starter = false;
		
		
		do {
		startSlå(s1);
		startSlå(s2);
	
		if (s1.getStartSum()>s2.getStartSum()) {
			s1Starter=true;
			ingenStarter=false;
			GUI.showMessage(s1.getNavn()+t.duStarter);
		}
		if (s1.getStartSum()<s2.getStartSum()) {
			s2Starter=true;
			ingenStarter=false;
			GUI.showMessage(s2.getNavn()+t.duStarter);
		}
		if (s1.getStartSum()==s2.getStartSum()) {
			GUI.showMessage(t.iSlogEns);
		}
		
		
		} while (ingenStarter!=false);		
		
		
		
		if (s1Starter!=false) {
		int i;
		for (i=0;i==0;) {
		tur(s1);
		if (s1.getScore()>=3000 || s2.getScore()>=3000)
			i=1;
		tur(s2);
		if (s1.getScore()>=3000 || s2.getScore()>=3000)
			i=1;
		} 
		}
		
		
		if (s2Starter!=false) {
			int i;
			for (i=0;i==0;) {
			tur(s2);
			if (s1.getScore()>=3000 || s2.getScore()>=3000)
				i=1;
			tur(s1);
			if (s1.getScore()>=3000 || s2.getScore()>=3000)
				i=1;
			} 
			}
		
	}
		public static Raflebæger r = new Raflebæger();
		public static Tekst t = new Tekst();
		
		
	public static void tur(Spiller s) {
		for (boolean tur=true; tur!=false;) {
			GUI.showMessage(dinTur(s));
		r.slå();
		GUI.setDice(r.getEnkeltVærdi1(), r.getEnkeltVærdi2());
		GUI.removeCar(1, s.getNavn());
		GUI.setCar(r.getSamletVærdi()+1, s.getNavn());
		switch(r.getSamletVærdi()) {
		case 2: GUI.showMessage(t.landetPå(2)); s.setScore(s.getScore()+250); GUI.setBalance(s.getNavn(), s.getScore());  break; 
		case 3: GUI.showMessage(t.landetPå(3)); s.setScore(s.getScore()-100); GUI.setBalance(s.getNavn(), s.getScore()); break;
		case 4: GUI.showMessage(t.landetPå(4)); s.setScore(s.getScore()+100); GUI.setBalance(s.getNavn(), s.getScore()); break;
		case 5: GUI.showMessage(t.landetPå(5)); s.setScore(s.getScore()-20); GUI.setBalance(s.getNavn(), s.getScore()); break;
		case 6: GUI.showMessage(t.landetPå(6)); s.setScore(s.getScore()+180); GUI.setBalance(s.getNavn(), s.getScore()); break;
		case 7: GUI.showMessage(t.landetPå(7)); GUI.setBalance(s.getNavn(), s.getScore()); break;
		case 8: GUI.showMessage(t.landetPå(8)); s.setScore(s.getScore()-70); GUI.setBalance(s.getNavn(), s.getScore()); break;
		case 9: GUI.showMessage(t.landetPå(9)); s.setScore(s.getScore()+60); GUI.setBalance(s.getNavn(), s.getScore()); break;
		case 10: GUI.showMessage(t.landetPå(10)); s.setScore(s.getScore()-80); GUI.setBalance(s.getNavn(), s.getScore()); break;
		case 11: GUI.showMessage(t.landetPå(11)); s.setScore(s.getScore()-50); GUI.setBalance(s.getNavn(), s.getScore()); break;
		case 12: GUI.showMessage(t.landetPå(12)); s.setScore(s.getScore()+650); GUI.setBalance(s.getNavn(), s.getScore()); break;
		}
		GUI.removeCar(r.getSamletVærdi(), s.getNavn());
		GUI.setCar(1, s.getNavn());
		if (r.getSamletVærdi()==10){
			tur=true;
		}
		else tur=false;
		}
		
	}
	
	public static String dinTur(Spiller s) {
		return s.getNavn()+" "+t.dinTur;
	}
	
	public static void startSlå(Spiller s) {
		r.slå();
		GUI.setDice(r.getEnkeltVærdi1(), r.getEnkeltVærdi2());
		GUI.showMessage(s.getNavn()+" "+t.duSlog+" "+r.getSamletVærdi());
		s.setStartSum(r.getSamletVærdi());
	}
}
