
public class Admnistrador extends Funcionario implements Autenticavel{
    
	private int senha;

    public double getBonificacao(){
    	return 50;
	}

    @Override
    public void setSenha(int senha){
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha){
    	return (this.senha == senha);
    }
}
