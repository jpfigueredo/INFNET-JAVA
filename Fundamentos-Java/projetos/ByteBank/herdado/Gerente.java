public class Gerente extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
	    return	super.getSalario() * 0.1 + super.getSalario();
	}
}