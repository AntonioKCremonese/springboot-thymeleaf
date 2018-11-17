package br.com.antonio.apiweb.projeto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.antonio.apiweb.projeto.model.Convidado;
import br.com.antonio.apiweb.projeto.repository.ConvidadoRepository;

@Service
public class ConvidadoService {
	
	@Autowired
	private ConvidadoRepository repository;
	
	public Iterable<Convidado> obterTodosConvidados() {
		
		Iterable<Convidado> convidados =  repository.findAll();
		return convidados;
	}
	
	public void salvar(Convidado convidado) {
		
		repository.save(convidado);
	}

}
