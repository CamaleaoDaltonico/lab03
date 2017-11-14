package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContatoTest {
	private Contato contatoBasico;
	@Before
	public void criaContato() {
		contatoBasico = new Contato("Gabriel", "Barros", "0000-0000");
	}
	
	@Test
	public void testNomeCompleto() {
		assertEquals("Gabriel Barros", contatoBasico.nomeCompleto());
	}
	
	@Test
	public void testToString() {
		assertEquals("Gabriel Barros - 0000-0000", contatoBasico.toString());
	}
}
