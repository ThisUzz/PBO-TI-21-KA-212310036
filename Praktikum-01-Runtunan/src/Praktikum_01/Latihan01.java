package Praktikum_01;

import javax.swing.JOptionPane;

public class Latihan01 {
	public static void main(String[] args) {
		String a,b;
		double suhuF,suhuK,suhuR;
		int y;
		
		a = JOptionPane.showInputDialog("masukan suhu celcius :");
		y = Integer.parseInt(a);
		
		suhuF = (y*0.8);
		suhuK = (1.8*y+32);
		suhuR = (y+273);
		
		JOptionPane.showMessageDialog(null,"suhu Farenheit : "+suhuF);
		JOptionPane.showMessageDialog(null,"suhu Kelvin : "+suhuK);
		JOptionPane.showMessageDialog(null,"suhu Reamur: "+suhuR);

	}

}
