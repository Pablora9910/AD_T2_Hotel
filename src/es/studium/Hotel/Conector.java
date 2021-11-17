package es.studium.Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	 private final static String driver = "com.mysql.cj.jdbc.Driver";
	 private final static String login = "root";
	 private final static String password = "Studium2020;";
	 private static String url = "jdbc:mysql://localhost:3306/";
	
	
	public static Connection conectar(String db)
	{
		
		Connection connection = null;
		
		try
		{
			//Cargar los controladores para el acceso a la BD
			Class.forName(driver);
			//Establecer la conexión con la BD Empresa
			connection = DriverManager.getConnection(url+db, login, password);
		}
		catch (ClassNotFoundException cnfe)
		{
			System.out.println("Error 1-"+cnfe.getMessage());
		}
		catch (SQLException sqle)
		{
			System.out.println("Error 2-"+sqle.getMessage());
		}
		return connection;
	}
	
	public static void desconectar(Connection con)
	{
		try
		{
			con.close();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
