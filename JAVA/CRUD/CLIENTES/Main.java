package JAVA.CRUD.CLIENTES;
import JAVA.CRUD.CLIENTES.model.Cliente;
import JAVA.CRUD.CLIENTES.repository.ClienteRepository;

public class Main {

    public static void main(String[] args) {
        ClienteRepository repository = new ClienteRepository();
        Cliente um = new Cliente("Rafael", "123456", "teste", 01);
        repository.adicionarCliente(um);
        repository.listarClientes();
    }
}
