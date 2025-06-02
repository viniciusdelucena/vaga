package JAVA.CRUD.CLIENTES.repository;

import JAVA.CRUD.CLIENTES.model.Cliente;

import java.util.*;

public class ClienteRepository{
    private final Map<String, Cliente> clientes = new HashMap<>();

    public void adicionar(Cliente cliente){
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente buscar(String cpf){
        return clientes.get(cpf);
    }

    public Collection<Cliente> listar(){
        return clientes.values();
    }

    public void remover(String cpf){
        clientes.remove(cpf);
    }

    public boolean existe(String cpf){
        return clientes.containsKey(cpf);
    }

}