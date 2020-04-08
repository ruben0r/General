package ejercicioAlumno;
/**
 * Clase definida para crear diferentes alumnos en el programa,
 * tiene los atributos del numero de expediente, nombre del alumno, conjunto de asignaturas del alumno,
 * y el conjunto de notas del alumno.
 * @author rubenRodriguezGarcia
 * @version 1.0
 */
public class Alumno 
{
	private int numExpediente;
	private String nombre;
	private String[] asignaturas;
	private int[] notas;
	/**
	 * Aquí está el constructor por defecto de Alumno, le da el valor de 11 al array de asignaturas y le
	 * introduce 11 asignaturas con distinto nombre, también se le da un tamaño de 10 al array notas.
	 */
	public Alumno() 
	{
		asignaturas = new String[11];
		asignaturas[0] = new String("Desarrollo de aplicaciones en el servidor");
		asignaturas[1] = new String("Desarrollo de aplicaciones web en el cliente");
		asignaturas[2] = new String("Despliegue de aplicaciones");
		asignaturas[3] = new String("Diseño de interfaces");
		asignaturas[4] = new String("Acceso a datos");
		asignaturas[5] = new String("Programación de servicios y procesos");
		asignaturas[6] = new String("Programación multimedia y de móviles");
		asignaturas[7] = new String("Sistemas de gestión empresarial");
		asignaturas[8] = new String("Desarrollo de interfaces");
		asignaturas[9] = new String("Iniciativa emprendedora");
		asignaturas[10] = new String("Inglés");
		notas = new int [10];
	}
	/**
	 * @param asignatura se comprueba que la asignatura exista
	 * @return existe es un booleano que es true si la asignatura existe y false sino.
	 */
	private boolean existeMateria (String asignatura) 
	{
		boolean existe = false;
		for (int i = 0; i < asignaturas.length && !existe; i++) 
		{
			existe = this.asignaturas[i] == asignatura;
		}
		return existe;
	}
	/**
	 * @param asignatura la asignatura a saber posicion en el array de asignaturas.
	 * @return posicion devuelve la posicion de la asignatura introducia.
	 */
	private int getIndexMateria (String asignatura) 
	{
		int posicion = -1;
		for (int i = 0; i < asignaturas.length && posicion == -1; i++) 
		{
			if (this.asignaturas[i] == asignatura)
			{
			 posicion = i;	
			}
			
		}
		return posicion;
	}
	/**
	 * @param nota, asignatura para introducir una nota en una asignatura.
	 * @return validNota true si la nota ha sido introducida correctamente o false si no.
	 */
	public	boolean ponerNota (int nota, String asignatura)
	{
		boolean validNota = false;
		if (existeMateria(asignatura))
		{
			notas[getIndexMateria(asignatura)] = nota;
			validNota = true;
		}
		return validNota;
	}
	/**
	 * @param asignatura se introduce la asignatura a saber nota
	 * @return nota devuelve la nota de la asignatura introducida
	 */
	public	int dameNota( String asignatura) 
	{
		int nota = -1;
		if (existeMateria(asignatura))
		{
		  nota = this.notas[getIndexMateria(asignatura)];	
		}
		return nota;
	}
	
	/**
	 * @return the numExpediente
	 */
	public int getNumExpediente() {
		return numExpediente;
	}

	/**
	 * @param numExpediente the numExpediente to set
	 */
	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the asignaturas
	 */
	public String[] getAsignaturas() {
		return asignaturas;
	}

	/**
	 * @param asignaturas the asignaturas to set
	 */
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * @return the notas
	 */
	public int[] getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(int[] notas) {
		this.notas = notas;
	}


}
