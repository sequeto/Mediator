package mediator;

import java.util.ArrayList;

public class SalaChat implements Chat{
	private static SalaChat instancia = new SalaChat();

	private ArrayList<Usuario> usuarios;
	
	public SalaChat(){
		this.usuarios= new ArrayList<Usuario>();
	}
	
	public static SalaChat getInstancia() {
        return instancia;
    }
	
	public void adicionarUsuario(Usuario usuario){
		this.usuarios.add(usuario);
	}
	
	public String enviarMensagem(String mensagem) {
		for(Usuario usuario : this.usuarios){
			usuario.receberMensagem(mensagem);
		}
		
		return "Mensagem Enviada aos usuarios do Chat com Sucesso";
	}
}
