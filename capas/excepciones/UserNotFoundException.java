package excepciones;


public class UserNotFoundException extends Exception {
//clase para manejar errores de inicio de sesion--> mail no regisrado
	public UserNotFoundException() {
		super("User email not found");
	}
}
