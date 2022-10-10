public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(500);

        SeguroDeVida seg = new SeguroDeVida();
        CalculadorImposto cp = new CalculadorImposto();
        cp.registrar(cc); //5
        cp.registrar(seg); //560

        System.out.println(cp.getImpostoMunicipal()); 
    }
}
