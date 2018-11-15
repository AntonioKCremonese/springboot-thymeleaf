package br.com.antonio.apiweb.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.antonio.apiweb.projeto.model.Convidado;
import br.com.antonio.apiweb.projeto.repository.ConvidadoRepository;


@Controller
public class ConvidadoController {
	
	@Autowired
	private ConvidadoRepository repository; 
	
	@RequestMapping("/")
	public String index () {
		return "index";
	}
	
	@RequestMapping("listaconvidados")
	public String listaConvidados(Model model) {
		
		Iterable<Convidado> convidados = repository.findAll();
		model.addAttribute("convidados", convidados);
		
		return "listaconvidados";
	}

}