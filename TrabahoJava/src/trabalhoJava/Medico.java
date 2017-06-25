package trabalhoJava;

public class Medico {

	private String nome;
	private String especialidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void mostra() {
		System.out.println("Nome Medico: " + this.nome);
		System.out.println("Especialidade Medico: " + this.especialidade);

	}

}
