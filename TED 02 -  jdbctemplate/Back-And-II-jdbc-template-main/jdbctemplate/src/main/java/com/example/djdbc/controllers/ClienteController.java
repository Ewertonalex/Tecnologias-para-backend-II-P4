package com.example.djdbc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.djdbc.entities.Cliente;
import com.example.djdbc.repositories.ClienteRepositoryDAO;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepositoryDAO repository;
	
	@GetMapping("/all")
	public List<Cliente> getAllClientes(){
		return repository.getAllClientes();
	}
	
	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Integer id) {
		return repository.getCliente(id);
	}

	@GetMapping("/{username}")
	public Cliente getClienteName(@PathVariable String username) {
		return repository.getClienteName(username);
	}

	@GetMapping("/{id}")
	public Cliente buscarCliente(@PathVariable Integer id) {
		return repository.getClienteId(id);
	}

}
