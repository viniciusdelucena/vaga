package JAVA.CRUD.CLIENTES.model;

public class Cliente{
    private String nome;
    private final String cpf;
    private String email;
    private String data;

    public Cliente(String nome, String cpf, String email, String data) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.data = data;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", email='" + getEmail() + "'" +
            ", data='" + getData() + "'" +
            "}";
    }

}