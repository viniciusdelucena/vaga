package JAVA.CRUD.CLIENTES;
import JAVA.CRUD.CLIENTES.model.Cliente;
import JAVA.CRUD.CLIENTES.repository.ClienteRepository;

public class Main {

    public static void main(String[] args) {
        ClienteRepository repository = new ClienteRepository();
        Cliente um = new Cliente("Rafael", "123456", "teste", 01);
        repository.adicionar(um);
        System.out.println(repository.listar());
        System.out.println(repository.buscar("123456"));
    }
}
