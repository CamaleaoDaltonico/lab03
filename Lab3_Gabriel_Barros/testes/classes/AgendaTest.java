package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgendaTest {
	private Agenda agenda;
	private Contato[] contatos;
	
	@Before
	public void criaAgenda() {
		contatos = new Contato[100];
		agenda = new Agenda();
		contatos[0] = new Contato("Gabriel", "Barros", "0000-0001");
		agenda.cadastrarContato(contatos[0], 1);
		contatos[1] = new Contato("Wanísia", "Sousa", "0000-0002");
		agenda.cadastrarContato(contatos[1], 2);
		contatos[99] = new Contato("Walter", "Barros", "0000-0100");
		agenda.cadastrarContato(contatos[99], 100);
	}
	
	@Test
	public void testCadastrarContato1() {	
		assertEquals(contatos[0], agenda.getContato(1));
	}
	
	@Test
	public void testCadastrarContato100() {	
		assertEquals(contatos[99], agenda.getContato(100));
	}
	
	@Test
	public void testCadastrarContatoAcima() {
		try {
			agenda.cadastrarContato(new Contato("Gabriel", "Barros", "0000-0000"), 101);
			fail();
		}catch(ArrayIndexOutOfBoundsException e) {
		}
	}
	
	@Test
	public void testExibirContato() {
		assertEquals(agenda.exibirContato(1), contatos[0].toString());
	}
	
	@Test
	public void testListarContatos() {
		
	}

}
