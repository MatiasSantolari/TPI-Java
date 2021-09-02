package testers;

import java.sql.SQLException;

import datos.ClientesData;
import datos.UsuariosData;

public class Tests {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		testGettersUsuarios();

	}
	
	public static void testGettersClientes() throws SQLException {
		System.out.println("Prueba get one(id=1):\n\n");
		ClientesData clidat= new ClientesData();
		System.out.println(clidat.getOne(1));
		System.out.println("");
		System.out.println("Prueba get all:\n\n");
		System.out.println(clidat.getAll());
	}
	
	public static void testGettersUsuarios() throws SQLException {
		System.out.println("Prueba get one(id=1):\n\n");
		UsuariosData usrs= new UsuariosData();
		System.out.println(usrs.getOne(1));
		System.out.println("");
		System.out.println("Prueba get all:\n\n");
		System.out.println(usrs.getAll());
	}

}
