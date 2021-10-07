package Prova;

public class FuncionarioHorista extends Funcionario{
    private double horasTrabalhadas;
    private double valorHora;

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    double calcSalario = horasTrabalhadas * valorHora;

    public FuncionarioHorista(String nome, String matricula){
    }

    public FuncionarioHorista(){}
}
