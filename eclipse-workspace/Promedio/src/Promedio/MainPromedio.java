package Promedio;

import javax.swing.JOptionPane;

public class MainPromedio {
	static MainPromedio mp=new MainPromedio();
	Promedio pr=new Promedio();
	public static void main(String[] args) {
		mp.Menu();
	}
	public void Menu() {
		String menu[]= {"Introducir número","Ver promedio","Salir"};
		int opcion=JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, null);
		switch(opcion) {
		case 0:{
			pr.agregarNumero(Integer.parseInt(JOptionPane.showInputDialog("Introduca el número")));
		}
		Menu();
		break;
		case 1:{
			JOptionPane.showMessageDialog(null, "El promedio de los "+pr.getCapacidad()+" números introducidos es de: "+pr.obtenerPromedio());
		}
		Menu();
		break;
		case 2:{
			
		}
		}
	}
}
