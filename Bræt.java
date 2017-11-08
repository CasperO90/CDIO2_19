package Spil;
import desktop_resources.GUI;

import java.awt.Color;

import desktop_fields.Empty;
import desktop_fields.Field;
import desktop_fields.Street;


public class Bræt {
	
	public Bræt() {
		Field[] fields = new Field[13];
		fields[0]= new Street.Builder().setTitle("Start").setSubText("").setRent("100").setDescription("Start").build();
		fields[1]= new Street.Builder().setTitle("Felt 1").setSubText("").setBgColor(Color.WHITE).setDescription("Felt 1").build();
		fields[2]= new Street.Builder().setTitle("2. Tower").setSubText("+250").setBgColor(Color.green).setDescription("2. Tower").build();
		fields[3]= new Street.Builder().setTitle("3. Crater").setSubText("-100").setBgColor(Color.RED).setDescription("3. Crater").build();
		fields[4]= new Street.Builder().setTitle("4. Palace Gates").setSubText("+100").setBgColor(Color.green).setDescription("4. Palace Gates").build();
		fields[5]= new Street.Builder().setTitle("5. Cold Desert").setSubText("-20").setBgColor(Color.RED).setDescription("5. Cold Desert").build();
		fields[6]= new Street.Builder().setTitle("6. Walled City").setSubText("+180").setBgColor(Color.green).setDescription("6. Walled City").build();
		fields[7]= new Street.Builder().setTitle("7. Monastery").setSubText("0").setBgColor(Color.WHITE).setDescription("7. Monastery").build();
		fields[8]= new Street.Builder().setTitle("8. Black Cave").setSubText("-70").setBgColor(Color.RED).setDescription("8. Black Cave").build();
		fields[9]= new Street.Builder().setTitle("9. Huts in the Mountain").setSubText("+60").setBgColor(Color.green).setDescription("9. Huts in the Mountain").build();
		fields[10]= new Street.Builder().setTitle("10. The Werewall").setSubText("-80").setBgColor(Color.RED).setDescription("10. The Werewall").build();
		fields[11]= new Street.Builder().setTitle("11. The Pit").setSubText("-50").setBgColor(Color.RED).setDescription("11. The Pit").build();
		fields[12]= new Street.Builder().setTitle("12. Goldmine").setSubText("+650").setBgColor(Color.green).setDescription("12. Goldmine").build();
		GUI.create(fields);
	}
	

}
