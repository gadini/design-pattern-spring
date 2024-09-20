package github.com.gadini.gof.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.gadini.gof.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
