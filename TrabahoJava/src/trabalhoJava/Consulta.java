package trabalhoJava;

public class Consulta {
	private static int contador = 1;
	private int codigo;
	private Paciente paciente;
	private Medico medico;

	//construtor base que auto incrementa o valor do codigo
	public Consulta() {
		this.codigo = contador++;
	}

	//construtor que já preenche os valores do medico e do paciente
	public Consulta(Paciente paciente, Medico medico) {
		this(); //Chama o construtor base
		this.paciente = paciente;
		this.medico = medico;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void mostra() {
		System.out.println("------------------");
		System.out.println("Codigo da consulta: " + this.codigo);
		//Reaproveita o codigo do mostra() da Classe Paciente
		this.paciente.mostra();
		//Reaproveita o codigo do mostra() da Classe Medico
		this.medico.mostra();
		System.out.println("------------------");
	}
}
