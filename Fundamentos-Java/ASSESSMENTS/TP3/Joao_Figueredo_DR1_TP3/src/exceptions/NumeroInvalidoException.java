package exceptions;

public class NumeroInvalidoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public NumeroInvalidoException(String mensagem) {
		super(mensagem);
	}
}
