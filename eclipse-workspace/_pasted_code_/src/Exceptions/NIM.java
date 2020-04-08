package Exceptions;
import javax.swing.JOptionPane;

public class NIM {
	public int getI1() {
		return i1;
	}
	public void setI1(int i1) {
		this.i1 = i1;
	}
	public int getI2() {
		return i2;
	}
	public void setI2(int i2) {
		this.i2 = i2;
	}
	public boolean[][] getTablero() {
		return Tablero;
	}
	public void setTablero(boolean[][] tablero) {
		Tablero = tablero;
	}
	private int i1;
	private int i2;
	private boolean[][] Tablero;
	public NIM()
	{
		this.i1=21;
		this.i2=21;
		Tablero=new boolean[7][7];
	}
	public void CogerFichas()
	{
		int num=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas fichas quieres mover"));
		for (int i=0;i<num;i++)
		{
			int[] fich=new int[2];
			fich[0]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posición x de la ficha a coger"));
			fich[1]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posición y de la ficha a coger"));
			if(Tablero[fich[0]][fich[1]]==false) 
			{
				Tablero[fich[0]][fich[1]]=true;
				JOptionPane.showMessageDialog(null,"Has cogido la ficha de la posicion: "+fich[0]+","+fich[1]);
			}
			else JOptionPane.showMessageDialog(null,"No hay ninguna ficha donde has elegido");
		}
	}
	public void ImprimirMatriz() 
	{
		String aux="";
		for (int i=0;i<Tablero.length;i++) 
		{
			for(int j=0;j<Tablero[0].length;j++)
			{
				if(Tablero[i][j]==true)
				{
				aux+="+";
				}
				else aux+="-"; 
			}
			aux+="\n";
		}
		JOptionPane.showMessageDialog(null,aux);
	}
}