package mediator;

public class Usuario {
	private String nome;
	private String mensagemRecebida;
	
	public Usuario(String nome){
		this.setNome(nome);
	}
	
	public String enviarMensagem(String mensagem) {
		return SalaChat.getInstancia().enviarMensagem(mensagem);
	}
	
	public void receberMensagem(String mensagem) {
		this.setMensagemRecebida(mensagem);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMensagemRecebida() {
		return mensagemRecebida;
	}

	public void setMensagemRecebida(String mensagemRecebida) {
		this.mensagemRecebida = mensagemRecebida;
	}
}
