package ec.edu.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.uce.service.IPacienteService;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private 
	IPacienteService pacienteService;
	
	@RequestMapping("/buscar/{idPaciente}")
	public String obtenerPaciente(@PathVariable( "idPaciente")Integer id, Model modelo){
		modelo.addAttribute("paci", this.pacienteService.read(id));
		return "paciente";//nombre de la vista
		
	}
}
