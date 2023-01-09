package mediator;

import static org.junit.Assert.*;

import org.junit.Test;


public class ChatTest {

	@Test
    public void deveRealizarEnvioDeMensagem() {
        Usuario usuario1 = new Usuario("João");
        
        Usuario usuario2 = new Usuario("Pedro");
        SalaChat.getInstancia().adicionarUsuario(usuario1);
        SalaChat.getInstancia().adicionarUsuario(usuario2);
        
        assertEquals("Mensagem Enviada aos usuarios do Chat com Sucesso", usuario1.enviarMensagem("Bom Dia"));
    }
	
	@Test
    public void deveReceberMensagem() {
        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Pedro");
        
        SalaChat.getInstancia().adicionarUsuario(usuario1);
        SalaChat.getInstancia().adicionarUsuario(usuario2);
        
        usuario1.enviarMensagem("Bom Dia");
        
        assertEquals("Bom Dia", usuario2.getMensagemRecebida());
    }
}
