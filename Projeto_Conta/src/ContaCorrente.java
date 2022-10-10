public class ContaCorrente extends Conta implements Tributavel {
    private Conta CorrenteTitular;
    private double impostos;

    public Conta getTitular() {
        return CorrenteTitular;
    }
    
    public void setTitular(Conta titular) {
        this.CorrenteTitular = titular;
    } 

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    @Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }

    //implementar os métodos abstratos da conta mãe -> outra coisa é incluir nos métodos principais de conta os valores de impostos.
}
