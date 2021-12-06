package exception;

public class JogadorInexistenteException extends Exception {
	private static final long serialVersionUID = 1L;

	public JogadorInexistenteException(String message) {
		super(message);
	}
}
