package trabalhoJava;

import java.util.ArrayList;

public class GerenciadorDeConsultas {

	ArrayList<Consulta> consultas;

	public void marcarConsulta(String nomePaciente, String planoPaciente,
			String nomeMedico, String especialidadeMedico) {
		// Verifica se já foi instanciado o array de consultas
		if (this.consultas == null) {
			this.consultas = new ArrayList<Consulta>();
		}

		// Cria o novo objeto do paciente
		Paciente paciente = new Paciente();
		paciente.setNome(nomePaciente);
		paciente.setPlano(planoPaciente);

		// Cria o novo objeto do medico
		Medico medico = new Medico();
		medico.setNome(nomeMedico);
		medico.setEspecialidade(especialidadeMedico);

		// Cria o objeto da nova consulta já informando medico e paciente
		Consulta consulta = new Consulta(paciente, medico);

		// Adiciona consulta na lista de consultas
		this.consultas.add(consulta);
	}

	public void consultarPorNomePacinete(String nomePaciente) {
		// for para verificar todas as consultas da lista 
		for (int i = 0; i < consultas.size(); i++) {
			// if nome do paciente da consulta na posição "i" iqual ao nome informado
			// mostra a consulta da posição "i"
			if (nomePaciente.equals(consultas.get(i).getPaciente().getNome())) {
				consultas.get(i).mostra();
			}
		}
	}

	public void consutarPorCodigo(int codigo) {
		// for para verificar todas a lista de consultas
		for (int i = 0; i < consultas.size(); i++) {
			// if codigo da consulta na posição "i" igual ao codigo informado
			// mostra a consulta da possição "i"
			if (consultas.get(i).getCodigo() == codigo) {
				consultas.get(i).mostra();
			}
		}
	}

	public void removerConsulta(int codigo) {
		// for para verificar toda a lista de consultas
		for (int i = 0; i < consultas.size(); i++) {
			// if codigo da consulta na posição "i" iqual ao codigo informdo
			// remove da lista a consulta da posição "i"
			if (consultas.get(i).getCodigo() == codigo) {
				//remove efetivamente consulta da lista
				//if pois metodo retorna se conseguiu ou não remover
				if(consultas.remove(consultas.get(i))){
					System.out.println("Consulta Cancelada\n");
				}
			}
		}

	}

	public void listarTodasAsConsutas() {
		//for para verificar todas a lista de consultas
		for (int i = 0; i < consultas.size(); i++) {
			//Mostra cada uma delas
			consultas.get(i).mostra();
		}
	}

}
