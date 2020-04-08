package Fraccion;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MainFraccion {
	static Fraccion[] f=new Fraccion[1];
	static int cantidad=1;
	public static void main(String[] args) {
		Menu();
	}
	public static void Menu() {
		String[] opciones= {"Crear fracción","Ver fracción","Salir del programa"};
		int opcion=JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Menú fracciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, null);
		switch(opcion) {
		case 0:{
			if(cantidad!=1) {
				f=Arrays.copyOf(f, cantidad);
			}
			for (int i=0;i<cantidad;i++) {
					if(f[i]==null) {
						int num=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numerador"));
						int den=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el denominador"));
						f[i]=new Fraccion(num,den);
					}
		}
			cantidad++;
		}

		Menu();
			break;
		case 1:{
			int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de la fracción que quiere ver"));
			JOptionPane.showMessageDialog(null, f[numero-1].toString());
		}
		Menu();
			break;
		case 2:{
			JOptionPane.showMessageDialog(null, "Fin del programa ;(");
		}
			break;
		}
	}
}
