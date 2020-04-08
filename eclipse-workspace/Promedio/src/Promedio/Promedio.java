package Promedio;

public class Promedio {
	private Integer aux[];
	private Integer[] num;
	private int capacidad=0;
	public Integer[] getAux() {
		return aux;
	}
	public Integer[] getNum() {
		return num;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void agregarNumero(int numero) {
		num=new Integer[capacidad+1];
		if(capacidad>0) {
			num=getAux();//Hay que crear un método para que rellene los valores antiguos del array num porque así toma el tamaño del array ese.
		}
		for(int i=0;i<capacidad+1;i++) {
			if(num[i]==null) {
				num[i]=numero;
				aux=getNum();
			}	
		}
		capacidad++;
	}
	public double obtenerPromedio() {
		double promedio=0d;
		for (int i=0;i<capacidad;i++) {
			if(num[i]!=null) {
			promedio=promedio+num[i];
		}
		}
		return promedio/capacidad;
	}
}
