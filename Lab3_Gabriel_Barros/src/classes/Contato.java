package classes;

public class Contato {
	private String nome;
	private String sobrenome;
	private String telefone;
	
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	public Contato() {
		this.nome = null;
		this.sobrenome= null;
		this.telefone = null;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String nomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	@Override
	public boolean equals(Object contato) {
		if (this.nome.equals(((Contato) contato).getNome()) &&
			this.sobrenome.equals(((Contato) contato).getSobrenome()) &&
			this.telefone.equals(((Contato) contato).getTelefone())) {
			return true;
		}
		return false;
	}
	
	/*public boolean equals(Contato contato) {
		if (this.nome.equals(contato.getNome())) {
			return true;
		}
		return false;
	}*/
	
	@Override
	public String toString() {
		return getNome() + " " + getSobrenome() + " - " + getTelefone();
	}
}
