package Spil;
import Spil.Terning;
public class Raflebæger {
	
	Terning t1 = new Terning("terning1");
	Terning t2 = new Terning("terning2");
	String Raflebæger;
	public int slag1, slag2;
	public int samletVærdi;
	
	public Raflebæger (String rb){
		Raflebæger=rb;
	}
	
	
	public void slå(){
		slag1 = t1.slag();
		slag2 = t2.slag();
		samletVærdi=slag1+slag2;
	}
	
	public void setSamletVærdi(int nyVærdi) {
		samletVærdi=nyVærdi;
}
	
	public int getSamletVærdi() {
		return samletVærdi;
	}
	
	public void setEnkeltVærdi1(int nyVærdi) {
			slag1=nyVærdi;
	}
	
	public int getEnkeltVærdi1() { //enkeltværdi for terning 1
		return slag1;
	}
	
	public void setEnkeltVærdi2(int nyVærdi) {
		slag2=nyVærdi;
}
	
	public int getEnkeltVærdi2() { //enkeltværdi for terning 2
		return slag2;
	}
	
}
