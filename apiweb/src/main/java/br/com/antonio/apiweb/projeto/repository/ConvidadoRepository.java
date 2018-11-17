package br.com.antonio.apiweb.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.antonio.apiweb.projeto.model.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

}
