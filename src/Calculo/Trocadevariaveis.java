package Calculo;

import javax.swing.JOptionPane;

public class Trocadevariaveis {
	public static void main(String[]args) {
		
		double c=0;
		double a=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));
		double b=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
		
		c=a;
		a=b;
		b=c;
		
		JOptionPane.showMessageDialog(null, "O primeiro numero e "+a);
		JOptionPane.showMessageDialog(null, "O segundo numero e "+b);
		
		System.out.println("O primeiro numero e: "+a);
		System.out.println("O segundoo numero e: "+b);
		
	}

}
