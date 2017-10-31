package Spil;

import java.util.Random;
	public class Terning {
		
		String terning;
		
		public Terning (String terningnavn){
		terning=terningnavn;
		}
		
		Random dice = new Random(); //Opretter tilfældighedsvariabel
		int terningslag;
		
		
		public int slag() {
			terningslag = 1+dice.nextInt(6);
			
			return terningslag;
		}
		
		public int getVærdi() {
			return terningslag;
		}
		
		
		
		
		
		
	}
	
	
	
	