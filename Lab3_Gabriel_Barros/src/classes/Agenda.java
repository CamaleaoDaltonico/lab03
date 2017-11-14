package classes;
import java.util.ArrayList;

public class Agenda {
	private Contato[] contatos;
	
	
	public Agenda() {
		this.contatos = new Contato[100];
	}
	
	
	
	public boolean cadastrarContato(Contato contato, int posicao) {
		if(posicao < 1 || posicao > 100) {
			throw new ArrayIndexOutOfBoundsException("Posição inválida");
		}
		this.contatos[posicao - 1] = contato;
		if (this.contatos[posicao - 1].equals(contato)){
			return true;
		}
		return false;
	}
	
	public String exibirContato(int posicao) { 
		if(this.contatos[posicao - 1] != null) {
			return this.contatos[posicao - 1].toString();
		}
		return null;
	}
	
	public ArrayList<String> listarContatos() {
		String contato;
		ArrayList<String> contatos = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			contato = "";
			if(this.contatos[i]  != null) {
				contato = (i+1) + " - " + this.contatos[i].nomeCompleto();
				contatos.add(contato);
			}
		}
		return contatos;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public Contato getContato(int posicao) {
		return this.contatos[posicao - 1];
	}
	
}

