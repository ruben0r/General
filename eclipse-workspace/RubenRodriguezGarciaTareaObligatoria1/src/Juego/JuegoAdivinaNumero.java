package Juego;

import javax.swing.JOptionPane;

public class JuegoAdivinaNumero extends Juego 
{
	private int num;
	private int numAdiv;
	private int record;
	private int backup;
	private String name;
	public JuegoAdivinaNumero(int num, int vidas)
	{
		super(vidas);
		this.num=num;
		this.backup=vidas;
	}
	public void Jugar() throws NumNoValido
	{
		while(Comprobar()==true)
		{
			try {
			numAdiv=entradaDeDatos.introducirNum();
			}
			catch(NumNoValido exc) {System.out.println(exc.toString());Jugar();}
			if(num==numAdiv)
			{
				JOptionPane.showMessageDialog(null, "Enhorabuena, ha acertado el numero.");
				Win();
			}
			else if(numAdiv>num)
				{
				JOptionPane.showMessageDialog(null, "El numero que buscas es menor");
				vidas--;
				}
			else
			{
				JOptionPane.showMessageDialog(null, "El numero que buscas es mayor");
				vidas--;
				}
		}
	}
	private boolean Comprobar() throws NumNoValido
	{
		boolean comp=true;
		if(vidas<=0)
		{
			comp=false;
			JOptionPane.showMessageDialog(null, "Ha perdido todas sus vidas, Game over.");
			Menu();
		}
		return comp;
	}
	private void Win() throws NumNoValido
	{
		if (vidas>record)
		{
			name=JOptionPane.showInputDialog(null, "Ha superado el record :), Introduzca su nombre para registrarlo.");
			record=vidas;
			Menu();
		}
		else if(vidas==record)
		{
			name=JOptionPane.showInputDialog(null, "Ha empatado el record :), Introduzca su nombre para registrarlo.");
			vidas=backup;
			Menu();
		}
		else
		{
			vidas=backup;
			Menu();
		}
	}
	private void Menu() throws NumNoValido
	{
		String options[]= {"¿Quiere volver a jugar?","Ver record", "Salir"};
		int op=JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "Menu Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
		switch (op)
		{
		case 0:
		{
			vidas=backup;
			Jugar();
		}
		break;
		case 1:
		{
			JOptionPane.showMessageDialog(null, "El record actual es de: "+name+"___"+record+ " vidas.");
			Menu();
		}
		break;
		case 2:
		{
			System.exit(1);
		}
		break;
		}
	}
}
