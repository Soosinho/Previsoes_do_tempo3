package br.usjt.previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsoes.model.Cidade;
import br.usjt.previsoes.repository.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepo;
	
	public List<Cidade> listarTodos(){
		return cidadeRepo.findAll();
	}
}
