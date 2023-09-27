package com.senai.Ana.Laura.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Ana.Laura.entities.Cliente;
import com.senai.Ana.Laura.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private final ClienteRepository clienteRepository;
	
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
    public Cliente saveCliente (Cliente cliente) {
	    return clienteRepository.save(cliente);
    }
    public Cliente getCliente (Long idcCliente) {
	    return clienteRepository.findById(idcCliente).orElse(null);
    }
    public List<Cliente> getAllProdutos() {
    	return clienteRepository.findAll();
    }
    public void deleteCliente(Long idcCliente) {
    	clienteRepository.deleteById(idcCliente);
    }
    public List<Cliente> getAllClientes() {
    	return null;
    }
    public Cliente getClienteById(Long idcCliente) {
    	return null;
    }
}
