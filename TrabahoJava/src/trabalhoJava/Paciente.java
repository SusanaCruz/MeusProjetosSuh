package trabalhoJava;

public class Paciente {
	private String nome;
	private String plano;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public void mostra() {
		System.out.println("Nome Paciente: " + this.nome);
		System.out.println("Plano Paciente: " + this.plano);

	}

}
