package Juego;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class entradaDeDatos {
	public static int introducirVidas() throws NumNoValido
	{
		int vidax=0;
		Pattern p=Pattern.compile("^([0-9])*$");
		String vidas=JOptionPane.showInputDialog("Introduzca el número de vidas que quiera introducir al iniciar el juego.");
		Matcher m=p.matcher(vidas);
		if (m.find())
		{
			vidax=Integer.parseInt(vidas);
		}
		else throw new NumNoValido();
		return vidax;
	}
	public static int introducirNum() throws NumNoValido
	{
		int aux=0;
		Pattern p=Pattern.compile("^([0-9])*$");
		String au=JOptionPane.showInputDialog("Introduzca el número que estés pensando.");
		Matcher m=p.matcher(au);
		if (m.find())
		{
			aux=Integer.parseInt(au);
		}
		else throw new NumNoValido();
		return aux;
	}
}
