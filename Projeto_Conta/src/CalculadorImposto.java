public class CalculadorImposto {
    private double totalImposto;

    public double getImpostoMunicipal() {
        return totalImposto;
    }
    public void setImpostoMunicipal(double impostoMunicipal) {
        this.totalImposto = impostoMunicipal;
    }

    public void registrar(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }
}
