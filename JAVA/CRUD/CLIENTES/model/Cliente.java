package JAVA.CRUD.CLIENTES.model;

public class Cliente{
    private String nome;
    private String cpf;
    private String email;
    private int data;


    public Cliente(String nome, String cpf, String email, int data) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", email='" + getEmail() + "'" +
            ", data='" + getData() + "'" +
            "}";
    }
}