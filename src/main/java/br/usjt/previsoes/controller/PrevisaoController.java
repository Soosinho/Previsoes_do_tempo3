package br.usjt.previsoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsoes.model.Previsao;
import br.usjt.previsoes.service.DiaSemanaService;
import br.usjt.previsoes.service.PrevisaoService;

@Controller
public class PrevisaoController {
	
	@Autowired
	private PrevisaoService previsaoService;
	
	@Autowired DiaSemanaService diaService;
	
	@GetMapping("/previsoes")
	public ModelAndView listarPrevisoes() {
		
		ModelAndView mv = new ModelAndView("lista_previsoes");
		
		mv.addObject(new Previsao());
		
		mv.addObject("previsoes", previsaoService.listarTodos());
		mv.addObject("diaSemana", diaService.listarTodos());
				
		return mv;
	}
	
	@PostMapping("/previsoes")
	public String salvar(Previsao previsao) {
		previsaoService.salvar(previsao);
		return "redirect:/previsoes";
	}

}
