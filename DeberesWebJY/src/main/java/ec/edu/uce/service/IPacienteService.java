package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.Paciente;

public interface IPacienteService {

	public void create(Paciente paciente);
	public Paciente read(Integer id); 
	public void update(Paciente paciente); 
	public void delete(Integer id); 
	
	public List<Paciente> buscarTodos();
}
