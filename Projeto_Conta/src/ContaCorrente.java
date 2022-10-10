public class ContaCorrente extends Conta {
    private Conta CorrenteTitular;

    public Conta getTitular() {
        return CorrenteTitular;
    }

    public void setTitular(Conta titular) {
        this.CorrenteTitular = titular;
    } 
}
