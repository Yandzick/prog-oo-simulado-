package Prova;

public abstract class Funcionario extends Pessoa {
    private String matricula;
    private Funcionario gerente;

    public Funcionario() {

    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario(String nome, String matricula){
        setNome(nome);
        setMatricula(matricula);
    }
}
