package br.unisul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.domain.Matricula;

@Repository
public interface Matr√≠culaRepository extends JpaRepository<Matricula, Integer> {

}