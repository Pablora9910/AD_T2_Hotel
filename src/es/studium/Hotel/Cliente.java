package es.studium.Hotel;

public class Cliente {
	private int idCliente;
	private String nombre;
	private String apellidos;
	private String email;
	private String DNI;
	private String clave;
	
	public Cliente() 
	{
		idCliente = 0;
		nombre = "";
		apellidos = "";
		email = "";
		DNI = "";
		clave = "";
	}
	
	public Cliente( int idC, String nC, String aC, String eC ,String dC,String cC) 
	{
		idCliente = idC;
		nombre = nC;
		apellidos = aC;
		email = eC;
		DNI = dC;
		clave = cC;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
