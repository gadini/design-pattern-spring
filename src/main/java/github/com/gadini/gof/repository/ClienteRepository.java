package github.com.gadini.gof.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.gadini.gof.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
