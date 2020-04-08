package Juego;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		int vidas =0;
		try
		{
		vidas=entradaDeDatos.introducirVidas();
		}
		catch(NumNoValido exc) {JOptionPane.showMessageDialog(null, exc.toString());main(args);}
		JuegoAdivinaNumero J=new JuegoAdivinaNumero(7,vidas);
		try
		{
		J.Jugar();
		}
		catch(NumNoValido exc) {JOptionPane.showMessageDialog(null, exc.toString());}
	}

}
