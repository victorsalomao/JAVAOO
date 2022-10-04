public class Funcionario {
    private String nome;
    private double salario;
    private String cpf;

    public double getBonificacao(){
        return this.salario * 2;
    }
    public double getTotalSalario(){
        return this.salario += getBonificacao();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
