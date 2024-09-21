package github.com.gadini.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import github.com.gadini.gof.model.Cliente;
import github.com.gadini.gof.repository.ClienteRepository;
import github.com.gadini.gof.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
