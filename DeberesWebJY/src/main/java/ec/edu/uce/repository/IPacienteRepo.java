package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.repository.modelo.Paciente;


public interface IPacienteRepo {

	public void create(Paciente paciente);
	public Paciente read(Integer id); 
	public void update(Paciente paciente); 
	public void delete(Integer id); 
	
	public List<Paciente> buscarTodos();
}
