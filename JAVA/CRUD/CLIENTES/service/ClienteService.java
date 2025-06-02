package JAVA.CRUD.CLIENTES.service;

import JAVA.CRUD.CLIENTES.repository.ClienteRepository;
import JAVA.CRUD.CLIENTES.model.Cliente;

import java.util.*;

public class ClienteService {
    private final ClienteRepository repository = new ClienteRepository();

    //CREATE
    public boolean adicionar(String nome, String cpf, String email, String data){
        if(repository.existe(cpf)) return false;
        Cliente cliente = new Cliente(nome, cpf, email, data);
        repository.adicionar(cliente);
        return true;
    }

    //READ
    public Cliente buscarPorCpf(String cpf){
        return repository.buscar(cpf);
    }

    public Collection<Cliente> listarTodos(){
        return repository.listar();
    }

    public boolean existe(String cpf){
        return repository.existe(cpf);
    }

    //UPDATE
    public boolean atualizar(String nome, String cpf, String email, String data){
        Cliente cliente = repository.buscar(cpf);
        if(cliente == null) return false;
        if(nome != null & !nome.isEmpty()) cliente.setNome(nome); 
        if(email != null & !email.isEmpty()) cliente.setEmail(email); 
        if(data != null & !data.isEmpty()) cliente.setData(data); 
        return true;
        //TO-DO
    }

    //DELETE
    public boolean remover(String cpf){
        if (!repository.existe(cpf)) return false;
        repository.remover(cpf);
        return true;
    }


}
