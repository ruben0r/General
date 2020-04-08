package Juego;

public class Juego {
	protected int vidas;
	public Juego(int vidas)
	{
		this.vidas=vidas;
	}
	public Juego(String vidas) throws NumNoValido
	{
		throw new NumNoValido();
	}
	public Juego(boolean vidas) throws NumNoValido
	{
		throw new NumNoValido();
	}
	public Juego(double vidas) throws NumNoValido
	{
		throw new NumNoValido();
	}
	public Juego(Integer vidas) throws NumNoValido
	{
		throw new NumNoValido();
	}
	public Juego(Double vidas) throws NumNoValido
	{
		throw new NumNoValido();
	}
	public Juego(char vidas) throws NumNoValido
	{
		throw new NumNoValido();
	}
}
