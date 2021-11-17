package es.studium.Hotel;

public class TestHotel {

	public static void main(String[] args) 
	{
		int id = ClientePersistencia.createCliente("Mar�a Jos�", "Mart�nez", "mjmartinez@grupostudium.com", "12345678Z",
				"Studium2020");
		System.out.println(ClientePersistencia.readCliente(id, "apellidosCliente"));
		ClientePersistencia.updateCliente(id, "apellidosCliente", "Mart�nez Navas");
		System.out.println(ClientePersistencia.readCliente(id, "apellidosCliente"));
        ClientePersistencia.deleteCliente(id);
		System.out.println(ClientePersistencia.readCliente(id, "apellidosCliente"));
	}

}
