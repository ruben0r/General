package ejercicioDesarrollaClase;
/**
 * Esta clase se define para poder crear Objetos de empleado en el programa.
 * @author ruben
 * @version 1.0
 */

public class Empleado 
{
	private String DNI;
	private String nombre;
	private String fechaAlta;
	private int codigoEmpleado;

	/**
	 * Constructor por defecto de la clase Empleado aunque no se le asigna ningun valor a los atributos, bueno null.
	 */
	public Empleado()
	{
		
	}
	/**
	 * Constructor por parametros de la clase Empleado, se asigna cada valor parametrizado a un atributo.
	 * @param DNI
	 * @param nombre
	 * @param fecha
	 * @param codigoEmpleado
	 */
	public Empleado (String DNI, String nombre, String fecha, int codigoEmpleado)
	{
		this.DNI = DNI;
		this.nombre = nombre;
		this.fechaAlta = fecha;
		this.codigoEmpleado = codigoEmpleado;
	}
	/**
	 * @return aux devuelve los datos del empleado en forma de String listo para imprimir por pantalla.
	 */
	public String	toString()
	{
		String aux;
		aux = ("DNI: "+this.DNI+" Nombre: "+this.nombre+" Fecha Alta: "
						+this.fechaAlta+ " Tipo Empleado:"+getTipoEmpleado()+" Código empleado: "+this.codigoEmpleado);
		return aux;
	}
	/**
	 * Comprueba si un DNI introducido por parametro corresponde con el DNI del objeto al que estas accediendo.
	 * @param e
	 * @return true||false si son iguales los DNI devuelve true, si no false.
	 */
	public boolean	equals(Empleado e) 
	{
		return this.DNI == e.getDNI();
	}
	/**
	 * 
	 * @return nombre devuelve el nombre del Empleado al que estás accediendo.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre introduce el nombre del Empleado al que estes accediendo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return nombre devuelve la fecha de alta del Empleado al que estes accediendo
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}
	/**
	 * 
	 * @param fechaAlta introduce la fecha de alta del Empleado al que estes accediendo
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	/**
	 * 
	 * @param tipoEmpleado introduce el tipo de empleado del Empleado al que estes accediendo y a la vez hace la comprobacion de que
	 * todo este en minusculas si no es asi lo cambia el propio metodo.
	 */
	public void setCodigoEmpleado(String tipoEmpleado) 
	{
		
		if (tipoEmpleado.toLowerCase().contains("analista"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("programador") ? 1299 : 1255;
		}else if (tipoEmpleado.toLowerCase().contains("programador"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("senior") ? 1555 : 1599;
		}else if (tipoEmpleado.toLowerCase().contains("administrador"))
		{
			codigoEmpleado = tipoEmpleado.toLowerCase().contains("senior") ? 1955 : 1999;
		}
		
	};
	/**
	 * 
	 * @return aux devuelve el tipo de empleado del Empleado al que estes accediendo.
	 */
	public String getTipoEmpleado()
	{
		String aux  = "";
		switch (this.codigoEmpleado)
		{
			case 1255:
				aux = "ANALISTA";
			break;
			case 1299:
				aux = "ANALISTA-PROGRAMADOR";
			break;
			case 1555:
				aux = "PROGRAMADOR SENIOR";
			break;
			case 1599:
				aux = "PROGRAMADOR JUNIOR";
			break;
			case 1955:
				aux = "ADMINITRADOR JUNIOR";
			break;
			case 1999:
				aux = "ADMINITRADOR JUNIOR";
			break;
		}
		return aux;
	}
	/**
	 * 
	 * @return codigoEmpleado devuelve el codigo de empleado del Empleado al que estes accediendo.
	 */
	public int getCodigoEmpleado() 
	{
		return codigoEmpleado;
	}
	/**
	 * 
	 * @param codigoEmpleado introduce el codigo de empleado del Empleado al que estes accediendo.
	 */
	public void setCodigoEmpleado(int codigooEmpleado) {
		this.codigoEmpleado = codigooEmpleado;
	}
	/**
	 * 
	 * @param DNI introduce el DNI del Empleado al que estes accediendo.
	 */
	public void setDNI(String DNI)
	{
		this.DNI = DNI;
	}
	/**
	 * 
	 * @return DNI devuelve el DNI del Empleado al que estes accediendo.
	 */
	public String getDNI() 
	{
		return DNI;
	}
	/**
	 * 
	 * @param fecha
	 * @return dif devuelve la diferencia entre dos fechas, la introduca por parametro
	 */
	public int	compareTo(String fecha)
	{   
		int dif;
		int f1 = this.getDNI().length();
		int f2 = fecha.length();
		dif = (f1 != f2) ? f1 - f2 : 0;  
		return dif;  
	}

}