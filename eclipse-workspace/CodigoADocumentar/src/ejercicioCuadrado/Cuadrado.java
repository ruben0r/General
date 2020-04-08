package ejercicioCuadrado;
/**
 * 
 * @author ruben
 * @version 1.0
 */
public class Cuadrado 
{
	private int x1, y1, x2, y2, x3, y3, x4, y4;
	/**
	 * Constructor Cuadrado
	 * @param se pasan las 8 coordenadas para formar 4 puntos.
	 */
	
	public Cuadrado(int _x1, int _y1, int _x2, int _y2, int _x3, int _y3, int _x4, int _y4) {
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
		x3 = _x3;
		y3 = _y3;
		x4 = _x4;
		y4 = _y4;
	}
	
	/**
	 * @param cx1,cy1,cx2,cy2 las 4 coordenadas (2 puntos) de los que sacar la distancia entre ellos.
	 * @return distanciaEntreDosPuntos devuelve la distancia entre dos puntos (4 coordenadas).
	 */
	private double distancia(int cx1, int cy1, int cx2, int cy2) {		 
		 return Math.sqrt((cx2-cx1)*(cx2-cx1) + (cy2-cy1)*(cy2-cy1));
	}
	/**
	 *
	 * @return distancia devuelve lo que mide un lado.
	 */
	public double lado() 
	{	
		// Asumimos que ya es un cuadrado y nos da lo mismo devolver cualquier lado
	    // teniendo en cuenta que tienen que ser correlativos
		return distancia(x1, y1, x2, y2);
	}
	
	/**
	 * Se comprueba si es un cuadrado comprobando la distancia entre sus diagonales.
	 * @return true||false devuelve true si las coordenadas introducidas forman un cuadrado o false si no.
	*/
	public boolean esCuadrado() 
	{
		return ( distancia(x1,y1,x2,y2) == distancia(x2,y2,x3,y3) &&
			 distancia(x2,y2,x3,y3) == distancia(x3,y3,x4,y4) &&					
			 distancia(x3,y3,x4,y4) == distancia(x4,y4,x1,y1)  )  ? true : false;
	}
	
	/**
	 * Este metodo imprime en pantalla un cuadrado, dibujando solo el borde con asteriscos.
	 */
	public void dibujar() 
	{
		// Calculamos el valor del lado de nuesto cuadrado:
		
			double lado = lado();
			
			
			//System.out.println("El lado vale lado " + lado);
			for (int i=0; i<lado;i++) 
				System.out.print("* ");
			
			System.out.println();
			
			for (int j=0; j<lado-2;j++)
			{
				System.out.print("*");
				
				for (int i=0; i<lado-2;i++) 
					System.out.print("  ");
				
				System.out.print(" *");
				System.out.println();
			}
			
			for (int i=0; i<lado;i++) 
				System.out.print("* ");
			
			System.out.println();
		
	}
	/**
	 * Este metodo imprime en pantalla un cuadrado, dibujando el borde y el interior del cuadrado, rellenado por asteriscos.
	 */
	public void dibRellenando() 
	{
		
			double lado = lado();
				
			for (int j=0; j<lado;j++) 
			{ 			
				for (int i=0; i<lado;i++) 
					System.out.print("* ");	
				System.out.println();
			}
		
	}
	/**
	 * Este metodo imprime en pantalla los vertices del cuadrado en coordenadas, en cada uno de los vértices del cuadrado dibujado.
	 */
	public void dibujarVertices() 
	{
		if (esCuadrado()) 
		{
			double lado = lado();
		
			System.out.printf("(%1d, %2d)", x2, y2);
			for (int i=1; i<lado-1;i++) 
				System.out.print("  ");
			System.out.printf("(%1d, %2d)%n", x3, y3);
			for (int j=0; j<lado-2;j++) 
			{		
				for (int i=0; i<lado;i++) 
					System.out.print("  ");
				
				System.out.println();
			}
			System.out.printf("(%1d, %2d)", x1, y1);
			for (int i=0; i<lado-2;i++) 
				System.out.print("  ");
			System.out.printf("(%1d, %2d)", x4, y4);
			System.out.println();
		}
		else System.out.println("¡No es un cuadrado!");
	}
	/**
	 * 
	 * @return area devuelve el area del cuadrado
	 */
	private double area() 
	{
		// Habría que plantearse un método que devuelva el lado sin
		// pasar parámetros, una vez comprobado que, efectivamente se trata de un cuadrado
		double l = lado();
		return l*l;
	}
	/**
	 * 
	 * Este metodo compara el area de dos cuadrados.
	 * @param Cuadrado se le pasa por parametro un objeto(Cuadrado).
	 * @return devuelve 1 si el mas grande es el primero o -1 si el mas grande es el segundo(introducido por parametro). 
	 */
	
	public int compara(Cuadrado c) 
	{   
		int resultadoComp = 0;
		
		if (area() > c.area())
			resultadoComp = 1;
		else if (area() < c.area())
				resultadoComp = -1;
		
		return resultadoComp;
	}
	/**
	 * @return toString devuelve los datos importantes sobre la clase, en este caso las coordenadas de los cuatro vértices.
	 */
	public String toString() 
	{
		return "Cuadrado definido por los vértices: (" + x1 + "," + y1 + ") " + " (" + x2 + "," + y2 + ") " +" (" + x3 + "," + y3 + ") " +
				" (" + x4 + "," + y4 + ")";
	}
}