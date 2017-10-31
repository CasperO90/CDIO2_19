package Spil;
import desktop_resources.GUI;

import java.awt.Color;

import desktop_fields.Empty;
import desktop_fields.Field;
import desktop_fields.Street;


public class Bræt {
	
	public Bræt() {
		Field[] fields = new Field[13];
		fields[0]= new Street.Builder().setTitle("Start").setSubText("").setRent("100").build();
		fields[1]= new Street.Builder().setTitle("Felt 1").setSubText("").setBgColor(Color.WHITE).build();
		fields[2]= new Street.Builder().setTitle("Tower").setSubText("+250").setBgColor(Color.green).build();
		fields[3]= new Street.Builder().setTitle("Crater").setSubText("-100").setBgColor(Color.RED).build();
		fields[4]= new Street.Builder().setTitle("Palace Gates").setSubText("+100").setBgColor(Color.green).build();
		fields[5]= new Street.Builder().setTitle("Cold Desert").setSubText("-20").setBgColor(Color.RED).build();
		fields[6]= new Street.Builder().setTitle("Walled City").setSubText("+180").setBgColor(Color.green).build();
		fields[7]= new Street.Builder().setTitle("Monastery").setSubText("0").setBgColor(Color.WHITE).build();
		fields[8]= new Street.Builder().setTitle("Black Cave").setSubText("-70").setBgColor(Color.RED).build();
		fields[9]= new Street.Builder().setTitle("Huts in the Mountain").setSubText("+60").setBgColor(Color.green).build();
		fields[10]= new Street.Builder().setTitle("The Werewall").setSubText("-80").setBgColor(Color.RED).build();
		fields[11]= new Street.Builder().setTitle("The Pit").setSubText("-50").setBgColor(Color.RED).build();
		fields[12]= new Street.Builder().setTitle("Goldmine").setSubText("+650").setBgColor(Color.green).build();
		GUI.create(fields);
	}

}
