package br.com.carlosjunior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carlosjunior.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
