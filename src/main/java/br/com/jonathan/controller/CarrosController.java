package br.com.jonathan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.jonathan.model.Carro;
import br.com.jonathan.service.CarrosService;

@Controller
public class CarrosController {
	/*@Autowired 
	private CarrosRepository carrosRepo;*/
	@Autowired
	private CarrosService carrosService;
	
	@GetMapping ("/carros")
	public ModelAndView listarCarros() {
		//List <Carro> carros = carrosRepo.findAll();
		List <Carro> carros = carrosService.listarTodos();
		ModelAndView mv = new ModelAndView("carros");
		mv.addObject(new Carro());
		mv.addObject("carros", carros);
		return mv;
	}
	@PostMapping("/carros")
	public String salvar (Carro carro) {
		//carrosRepo.save(carro);
		carrosService.salvar(carro);
		return "redirect:/carros";
	}
}







