package br.com.jonathan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jonathan.model.Carro;
import br.com.jonathan.repository.CarrosRepository;
import br.com.jonathan.utils.Calculadora;

@Service
public class CarrosService {
	
	@Autowired
	private CarrosRepository carrosRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Carro carro) {
		carrosRepo.save(carro);
	}
	
	public List <Carro> listarTodos(){
		List <Carro> carros = carrosRepo.findAll();
		for (Carro carro : carros) {
			carro.setAutonomia(calculadora.calcularAutonomia(carro.getKmL(), carro.getQtdLitro()));
		}
		return carros;
	}
}
