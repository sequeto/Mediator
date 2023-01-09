package mediator;

public interface Chat {
	String enviarMensagem(String mensagem);
	
	void adicionarUsuario(Usuario usuario);
}
