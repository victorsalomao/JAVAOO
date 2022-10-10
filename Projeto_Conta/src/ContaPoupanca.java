public class ContaPoupanca extends Conta{
    private Conta PoupancaTitular;

    public Conta getTitular() {
        return PoupancaTitular;
    }

    public void setTitular(Conta titular) {
        this.PoupancaTitular = titular;
    } 
}
