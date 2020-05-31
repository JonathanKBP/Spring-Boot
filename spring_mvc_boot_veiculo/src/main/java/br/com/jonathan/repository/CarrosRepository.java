package br.com.jonathan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jonathan.model.Carro;

@Repository
public interface CarrosRepository extends JpaRepository <Carro, Long> {

}
