package ufjf.br;

public class Colaborador implements Cloneable{
    private int cpf;
    private String nome;
    private Endereco endereco;
    private String cargo;

    public Colaborador(int cpf, String nome, Endereco endereco, String cargo) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cargo = cargo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    protected Colaborador clone() throws CloneNotSupportedException {
        Colaborador colaboradorClone = (Colaborador) super.clone();
        colaboradorClone.endereco = (Endereco) colaboradorClone.endereco.clone();
        return colaboradorClone;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
