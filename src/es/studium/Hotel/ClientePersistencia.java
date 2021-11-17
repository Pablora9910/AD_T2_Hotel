package es.studium.Hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientePersistencia {
	
	 static Connection connection = Conector.conectar("hotel");
	 static Statement statement = null;
	 static ResultSet rs = null;
	 static String sentencia = "" ;
	 
	public static int createCliente(String nombre, String apellidos, String email, String dni, String clave) {
		int id = 0;
		try  
		{
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			sentencia = "INSERT INTO clientes VALUES (null ,'"+nombre+"','"+apellidos+"','"+email+"','"+dni+"','"+clave+"')";
			statement.executeUpdate(sentencia);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			sentencia = "SELECT idCliente FROM clientes ORDER BY idCliente DESC LIMIT 1;";
			statement = connection.createStatement();
			rs = statement.executeQuery(sentencia);
			while(rs.next())
			{
				id = rs.getInt("idCliente");
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return id;
	}
	
	public static String readCliente(int idCliente, String campo) {
		
		String resultado  = "";
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			sentencia = "SELECT "+campo+" FROM clientes WHERE idCliente = "+idCliente+";";
			statement = connection.createStatement();
			rs = statement.executeQuery(sentencia);
			while(rs.next())
			{
				resultado = rs.getString(campo);
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return resultado;
	}
 
	public static boolean updateCliente(int idCliente, String campo, String nuevoValor) {
		boolean update = true;
		try  
		{
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			sentencia = "update clientes set "+campo+" = '"+ nuevoValor +"' where idCliente = '"+idCliente+"' ;";
			statement.executeUpdate(sentencia);
			update = true;
		}
		catch (SQLException e) {
			update = false;
		}
			
		return false;
	}
 
	public static boolean deleteCliente(int idCliente) {
		boolean delete = false;
		try {
			sentencia = "delete from clientes where idCliente ='"+idCliente+"';";
			statement = connection.prepareStatement(sentencia);
			statement.executeUpdate(sentencia);
			delete = true ;
		} catch (SQLException e) {
			delete = false;
		}
		return delete;
	}

}
