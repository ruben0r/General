package ejercicioDesarrollaFigura;

/**
 * Define la clase Figura para poder crear objetos Figura en el programa.
 * @author ruben
 * @version 1.0
 */
public class Figura 
{
	private String forma;
	private String color;
	private static final String ListaColores[] = {"rojo", "anaranjado", "amarillo", "verde", "azul",
			"violeta","rosa", "negro", "blanco", "oro", "plata", "bronce"};
/**
 * Metodo constructor por defecto de Figura, pero no se le asigna ningun valor a los atributos.
 */
	public Figura()
	{
		
	}
	/**
	 * Metodo constructor parametrizado de Figura.
	 * @param forma 
	 * @param color
	 */
	public Figura(String forma, String color)
	{
		this.forma ="";
		this.color ="";
	}
	/**
	 * Metodo constructor parametrizado de figura, se le introduce solo la forma, el color no se utiliza.
	 * @param forma
	 * @param color
	 */
	public Figura(String forma, int color)
	{
		this.forma = forma;		
	}
	/**
	 * Metodo getter para obtener la forma del objeto Figura.
	 * @return forma
	 */
	public String getForma() 
	{
		return forma;
	}
	/**
	 * Metodo para introducir la forma de la figura.
	 * @param forma
	 */
	public void setForma(String forma) 
	{
		this.forma = forma;
	}
	/**
	 * Metodo para obtener el color de la Figura.
	 * @return color
	 */
	public String getColor() 
	{
		return color;
	}
	/**
	 * Metodo para validar que el numero del color introducido esta en la lista de colores.
	 * @param color
	 * @return true||false true si los colores coinciden, aflse si no.
	 */
	public static boolean validColor(int color)
	{
		return color > 0  && color < ListaColores.length;
	}
	/**
	 * Metodo para validar que el color introducido en forma de nombre esta en la lista de colores.
	 * @param color
	 * @return true||false devuelve true si el color coincide y false si no.
	 */
	public static boolean  validColor(String color)
	{
		boolean isValid = false;
		for (int i = 0; i < ListaColores.length && !isValid; i++) 
		{
			isValid = ListaColores[i] == color;
		}
		return isValid;
	}
	/**
	 * Metodo parar introducir el color de la figura (en forma de nombre), a la vez valida que el color introducido sea correcto, valida que este numero sea correcto con el metodo anteriormente mencionado..
	 * @param color
	 */
	public void setColor(String color) 
	{
		if (validColor(color)) 
		{
			this.color = color;	
		}
			
	}
	/**
	 * Metodo para introducir el color indicando el numero de la lista de colores, valida que este numero sea correcto con el metodo anteriormente mencionado.
	 * @param color
	 */
	public void setColor(int color) 
	{
		if(validColor(color))
		{
			this.color = colorToColor(color);
		}
	}
	/**
	 * Metodo para pasar de color en forma de nombre a color en forma de numero (posicion del color).
	 * @param color
	 * @return posicion devuelve la posicion en la que esta el color introducido. 
	 */
	private int colorToColor(String color)
	{
		int posicion = -1;
		for (int i = 0; i < ListaColores.length && posicion != -1; i++) 
		{
			if (ListaColores[i] == color)
			{
				posicion = i;
			}
		}
		return posicion;
	}
	/**
	 * Metodo para pasar de color en forma de numero (posicion del color) a color en forma de nombre.
	 * @param color
	 * @return posicion devuelve el color que esté en la posición introducida. 
	 */
	private String colorToColor(int color)
	{
		return color > 0 && color < ListaColores.length ? ListaColores[color]: "";
	}
}