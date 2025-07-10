package br.com.santangelo.yaskara.hrworker.repositories;

import br.com.santangelo.yaskara.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
