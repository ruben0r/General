package Fraccion;

public class Fraccion {
	private int num;
	private int den;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return this.den;
	}
	public void setDen(int den) {
		this.den = den;
	}
	public Fraccion() {
		this.num=1;
		this.den=1;
	}
	public Fraccion(int num,int den) {
		this.num=num;
		this.den=den;
	}
	public String toString() {
		return "  " +num + "\n"+"----- \n" +"  "+ den;
	}
}
