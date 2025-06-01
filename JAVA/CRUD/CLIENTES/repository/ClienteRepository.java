package JAVA.CRUD.CLIENTES.repository;
import JAVA.CRUD.CLIENTES.model.*;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);    
    }

    public List<Cliente> listarClientes(){
        return clientes;
    }
}
