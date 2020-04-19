package br.usjt.previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsoes.model.DiaSemana;
import br.usjt.previsoes.repository.DiaSemanaRepository;

@Service
public class DiaSemanaService {

	@Autowired
	private DiaSemanaRepository diaRepo;
	
	public List<DiaSemana> listarTodos(){
		return diaRepo.findAll();
	}
}
