public class SeguroDeVida implements Tributavel{
    private double valor;

    @Override
    public double getValorImposto(double valorX){
        return this.valor -= valorX;
    }
}
